<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%
    Map<String, String> errores = (Map<String, String>) request.getAttribute("errores");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body style="width: 80%; margin: auto">
    <div style="text-align: center;">
        <h2>Formulario de usuarios</h2>

<%
    if(errores != null && errores.size() > 0){
%>

    <ul>
        <%
            for(String error: errores.values()){
        %>
            <li>
                <%=error%>
            </li>
        <%
          }
        %>
    </ul>

<%
  }
%>

        <form action="/webapp-form/registro" method="post">
            <div class="row mb-3">
                <div class="form-control">
                    <label class="col-form-label" for="username"> Usuario </label>
                    <input type="text" name="username" id="username">
                </div>
                <%
                    if(errores != null && errores.containsKey("username")){
                        out.println("<small style='color:red;'>" + errores.get("username") + "</small>");
                    }
                %>
            </div>
            <div class="row mb-3">
                <div class="form-control">
                    <label class="col-form-label" for="password"> Password </label>
                    <input type="password" name="password" id="password">
                </div>
                <%
                    if(errores != null && errores.containsKey("password")){
                        out.println("<small style='color:red;'>" + errores.get("password") + "</small>");
                    }
                %>
            </div>
            <div class="row mb-3">
                <div class="form-control">
                    <label class="col-form-label" for="email"> Email </label>
                    <input type="email" name="email" id="email">
                </div>
                <%
                    if(errores != null && errores.containsKey("email")){
                        out.println("<small style='color:red;'>" + errores.get("email") + "</small>");
                    }
                %>
            </div>
            <div class="row mb-3">
                <div class="form-control">
                    <label class="col-form-label" for="pais"> Pais: </label>
                    <select name="pais" id="pais">
                        <option value="">-- Seleccionar --</option>
                        <option value="AR" selected>Argentina</option>
                        <option value="BR">Brasil</option>
                        <option value="UR">Uruguay</option>
                        <option value="CL">Chile</option>
                        <option value="PE">Peru</option>
                        <option value="CO">Colombia</option>
                        <option value="VE">Venezuela</option>
                    </select>
                </div>
                <%
                    if(errores != null && errores.containsKey("pais")){
                        out.println("<small style='color:red;'>" + errores.get("pais") + "</small>");
                    }
                %>
            </div>

            <div class="row mb-3">
                <div class="form-control">
                    <label class="col-form-label" for="lenguajes"> Lenguajes de programacion</label>
                    <select style="width: 150px; height: 110px" name="lenguajes" id="lenguajes" multiple>
                        <option value="java" selected>Java</option>
                        <option value="js" selected>JavaScript</option>
                        <option value="html">HTML</option>
                        <option value="css">CSS</option>
                        <option value="react" selected>React</option>
                        <option value="angular">Angular</option>
                    </select>
                </div>
                <%
                    if(errores != null && errores.containsKey("lenguajes")){
                        out.println("<small style='color:red;'>" + errores.get("lenguajes") + "</small>");
                    }
                %>
            </div>

            <div class="row mb-3">
                <div class="form-control">
                    <label class="col-form-label">Roles</label>
                    <div>
                        <input type="checkbox" name="roles" value="ROLE_ADMIN" checked>
                        <label>Administrador</label>
                    </div>
                    <div>
                        <input type="checkbox" name="roles" value="ROLE_MOD">
                        <label>Moderador</label>
                    </div>
                    <div>
                        <input type="checkbox" name="roles" value="ROLE_USER">
                        <label>Usuario</label>
                    </div>
                </div>
            </div>
            
            <div class="row mb-3">
                <div class="form-control">
                    <label class="col-form-label">Idiomas</label>
                    <div>
                        <input type="radio" name="idioma" value="es">
                        <label>Español</label>
                    </div>
                    <div>
                        <input type="radio" name="idioma" value="en">
                        <label>Ingles</label>
                    </div>
                    <div>
                        <input type="radio" name="idioma" value="fr">
                        <label>Frances</label>
                    </div>
                </div>
            </div>

            <div class="row mb-3">
                <div class="form-control">
                    <label class="col-form-label" for="habilitar">Habilitar</label>
                    <input type="checkbox" name="habilitar" id="habilitar" checked>
                </div>
            </div>

            <div>
                <div>
                    <input type="submit" value="Enviar">
                </div>
            </div>

            <input type="hidden" name="secreto" value="12345">
        </form>
    </div>

</body>
</html>