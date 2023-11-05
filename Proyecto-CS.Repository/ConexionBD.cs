using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proyecto_CS.DAL
{
    public class ConexionBD
    {
        private IConfiguration _configuration;

        public ConexionBD(IConfiguration configuration)
        {
            _configuration = configuration;
        }

        public SqlConnection ObtenerConexion()
        {
            string cadenaConexion = _configuration.GetConnectionString("cadenaSQL");
            return new SqlConnection(cadenaConexion);
        }
    }
}
