using Microsoft.AspNetCore.Mvc;
using Proyecto_CS.DAL;
using Proyecto_CS_Controller;
using System.Data.SqlClient;

namespace Proyecto_CS_View.Controllers
{
    public class PruebaConexionController : Controller
    {
        private readonly IConfiguration _configuration;

        public PruebaConexionController(IConfiguration configuration)
        {
            _configuration = configuration;
        }

        public ActionResult Index()
        {
            using (SqlConnection conexion = new ConexionBD(_configuration).ObtenerConexion())
            {
                PruebaConexionBLL pruebaConexionBLL = new PruebaConexionBLL();
                bool conexionExitosa = pruebaConexionBLL.ProbarConexion(conexion);
                ViewBag.ConexionExitosa = conexionExitosa;
                return View();
            }
        }
    }
}
