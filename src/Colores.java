import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 46465442z on 12/04/16.
 */
public class Colores extends HttpServlet {

    public Colores() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/index.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String valueString = req.getParameter("value");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>\n" +
                "  <head>\n" +
                "\n" +
                "    <title>Servlet de la vida</title>\n" +
                "\n" +
                "    <!-- Importamos Bootstrap  -->\n" +
                "    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n" +
                "    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n" +
                "\n" +
                "    <!-- Barra de navegación -->\n" +
                "    <nav class=\"navbar navbar-default\">\n" +
                "      <div class=\"container-fluid\">\n" +
                "\n" +
                "        <!-- Brand and toggle get grouped for better mobile display -->\n" +
                "        <div class=\"navbar-header\">\n" +
                "          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n" +
                "            <span class=\"sr-only\">Toggle navigation</span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "            <span class=\"icon-bar\"></span>\n" +
                "          </button>\n" +
                "          <a class=\"navbar-brand\" href=\"./index.jsp\">Sergi Barjola | Poblenou </a>\n" +
                "        </div>\n" +
                "\n" +
                "      </div>\n" +
                "    </nav>\n" +
                "  </head>\n" +
                "<body>\n" +
                "   <center>\n" +
                "       <h1>Dale color a la vida</h1>\n" +
                "           <p>Texto original: " + valueString + "</p>"
        );

        switch (valueString.toLowerCase()) {

            case "rojo":
                out.println("<font color=\"red\" size=\"25\">" + valueString + "</font>");
            break;

            case "amarillo":
                out.println("<font color=\"yellow\" size=\"25\">" + valueString + "</font>");
            break;

            case "azul":
                out.println("<font color=\"blue\" size=\"25\">" + valueString + "</font>");
            break;

            case "naranja":
                out.println("<font color=\"orange\" size=\"25\">" + valueString + "</font>");
            break;

            case "verde":
                out.println("<font color=\"green\" size=\"25\">" + valueString + "</font>");
            break;

            case "lila":
                out.println("<font color=\"purple\" size=\"25\">" + valueString + "</font>");
            break;

            case "negro":
                out.println("<font color=\"black\" size=\"25\">" + valueString + "</font>");
            break;

            case "marron":
                out.println("<font color=\"brown\" size=\"25\">" + valueString + "</font>");
            break;

            case "rosa":
                out.println("<font color=\"pink\" size=\"25\">" + valueString + "</font>");
            break;

            case "gris":
                out.println("<font color=\"grey\" size=\"25\">" + valueString + "</font>");
            break;

            default:
                out.println(" <img src=\"http://vignette2.wikia.nocookie.net/gearsofwar/images/f/f2/Carita-triste_1657.jpg/revision/latest?cb=20120204043221&path-prefix=es\" alt=\"Miss ya\" height=\"400\" width=\"550\">");
            break;
        }

        out.println("   <form action=\"./index.jsp\">\n" +
                "           <input type=\"submit\" value=\"Volver\">\n" +
                "       </form> \n" +
                "   </center>\n" +
                "  </body>\n" +
                "</html>");
    }
}