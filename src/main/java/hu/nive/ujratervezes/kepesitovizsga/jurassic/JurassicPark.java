package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (Connection cnx = dataSource.getConnection();
             Statement stmt = cnx.createStatement();
             ResultSet rs = stmt.executeQuery("select breed from dinosaur where actual > expected")) {
            return getNamesFromStatement(rs);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot load database", se);
        }
    }

    private List<String> getNamesFromStatement(ResultSet rs) throws SQLException {
        List<String> namesOfDinos = new ArrayList<>();
        while(rs.next()) {
            namesOfDinos.add(rs.getString("breed"));
        }
        return namesOfDinos;
    }
}
