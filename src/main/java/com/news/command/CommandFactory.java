package com.news.command;

public class CommandFactory {

    public static Command createCommand(String commandT) {
         switch (commandT) {
             case "command_create_author":
                 return new CreateAuthor();
             case "command_read_author":
                 return new ReadAuthor();
             case "command_update_author":
                 return new UpdateAuthor();
             case "command_delete_author":
                 return new DeleteAuthor();
             case "command_create_news":
                 return new CreateNews();
             case "command_read_news":
                 return new ReadNews();
             case "command_update_news":
                 return new UpdateNews();
             case "command_delete_news":
                 return new DeleteNews();
             case "command_create_user":
                 return new CreateUser();
             case "command_read_user":
                 return new ReadUser();
             case "command_update_user":
                 return new UpdateUser();
             case "command_delete_user":
                 return new DeleteUser();
             case "command_create_role":
                 return new CreateRole();
             case "command_read_role":
                 return new ReadRole();
             case "command_update_role":
                 return new UpdateRole();
             case "command_delete_role":
                 return new DeleteRole();
             case "command_create_tag":
                 return new CreateTag();
             case "command_read_tag":
                 return new ReadTag();
             case "command_update_tag":
                 return new UpdateTag();
             case "command_delete_tag":
                 return new DeleteTag();
             case "command_login_user":
                 return new Login();
             default:
                 return null;
         }
    }
}