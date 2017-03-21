/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessagePackage;

import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author C0600299
 */
@ApplicationScoped
public class MessageController {

    private List<Session> people = new ArrayList<>();
    private List<JsonObject> messages = new ArrayList<>();

}
