package controller;

import org.springframework.stereotype.Controller;


@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/persons/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("personAttribute") Person person) {
        logger.debug("Received request to add new person");

        // The "personAttribute" model has been passed to the controller from the JSP
        // We use the name "personAttribute" because the JSP uses that name
        // Call PersonService to do the actual adding
        // модель "personAttribute" передана контроллеру из JSP
        // мы используем имя "personAttribute" потому что JSP  страница использует его
        // Вызов PersonService для совершения добавления
        personService.add(person);

        // This will resolve to /WEB-INF/jsp/addedpage.jsp
        return "addedpage";
    }
}
