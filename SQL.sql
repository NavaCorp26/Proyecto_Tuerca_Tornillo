-- Language: plpgsql

-- DROP LANGUAGE IF EXISTS plpgsql

CREATE OR REPLACE TRUSTED PROCEDURAL LANGUAGE plpgsql
    HANDLER plpgsql_call_handler
    INLINE plpgsql_inline_handler
    VALIDATOR plpgsql_validator;

ALTER LANGUAGE plpgsql
    OWNER TO postgres;

COMMENT ON LANGUAGE plpgsql
    IS 'PL/pgSQL procedural language';
CREATE TABLE usuarios (
    id serial PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL,
    apellido VARCHAR(15) NOT NULL,
    cedula VARCHAR(10) NOT NULL,
    telefono INT NOT NULL,
    correo VARCHAR(25) NOT NULL,
    direccion VARCHAR(25) NOT NULL,
    nombre_usuario VARCHAR(15) NOT NULL,
    contrasena VARCHAR(25) NOT NULL,
    rol VARCHAR(15) CHECK (rol IN ('Cliente', 'Administrador', 'Proveedor'))
);