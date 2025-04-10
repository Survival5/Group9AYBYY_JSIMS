/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import domain.College;
import java.sql.SQLException;
import java.util.List;
import persistence.ICollegePersistence;

/**
 *
 * @author Besu
 */
public class CollegeService implements ICollegeService {

    private final ICollegePersistence collegePersistance = new CollegePersistence();

    @Override
    public boolean register(College college) throws SQLException {
        return collegePersistance.save(college);
    }

//    @Override
//    public List<String> getAll() throws SQLException {
//        return collegePersistance.getAll();
    }
}
