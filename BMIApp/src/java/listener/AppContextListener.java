/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listener;

import javax.servlet.*;

public class AppContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Ứng dụng BMI đã khởi động lúc: " + new java.util.Date());
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Ứng dụng BMI đã dừng.");
    }
}
