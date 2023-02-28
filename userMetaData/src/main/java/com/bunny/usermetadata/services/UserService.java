package com.bunny.usermetadata.services;

import com.bunny.usermetadata.entity.UserMetaData;
import com.bunny.usermetadata.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    // submit the data into database
    public UserMetaData saveUserMetaDataToDb(UserMetaData metaData) {
        return userRepo.save(metaData);
    }

    // retrieve the data from database
    public UserMetaData getUserDetailsFromDb(String userId) {
        return userRepo.findAllByUniqueId(userId);
    }
}
