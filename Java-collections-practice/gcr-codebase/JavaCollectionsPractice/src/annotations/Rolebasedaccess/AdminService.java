package annotations.Rolebasedaccess;

@RoleAllowed("ADMIN")
class AdminService {

    public void performAdminTask() {
        System.out.println("Admin task executed successfully");
    }
}
