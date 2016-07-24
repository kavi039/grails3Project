import com.demoGrails3.Role
import com.demoGrails3.User
import com.demoGrails3.UserRole

class BootStrap {

    def init = { servletContext ->

        User admin = new User(username: "kavita", password: "1234").save(flush: true)
        Role adminRole = new Role(authority: "ROLE_ADMIN").save(flush: true)
        UserRole userRole = new UserRole(user: admin, role: adminRole).save(flush: true)
    }
    def destroy = {
    }
}
