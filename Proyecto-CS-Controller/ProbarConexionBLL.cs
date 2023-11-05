using Proyecto_CS.DAL;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proyecto_CS_Controller
{
    public class PruebaConexionBLL
    {
        public bool ProbarConexion(SqlConnection conexion)
        {
            try
            {
                conexion.Open();
                return true;
            }
            catch
            {
                return false;
            }
        }
    }
}
