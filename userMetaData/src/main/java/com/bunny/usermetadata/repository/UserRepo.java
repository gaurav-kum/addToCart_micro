package com.bunny.usermetadata.repository;

import com.bunny.usermetadata.entity.UserMetaData;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserMetaData, Long> {

    UserMetaData save(UserMetaData userData);

    UserMetaData findAllByUniqueId(String uniqueId);
}
