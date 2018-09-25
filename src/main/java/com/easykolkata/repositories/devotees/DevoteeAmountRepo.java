package com.easykolkata.repositories.devotees;

import org.springframework.data.repository.CrudRepository;
import com.easykolkata.models.devotees.DevoteeTemporaryCommitments;

public interface DevoteeAmountRepo extends CrudRepository<DevoteeTemporaryCommitments, Integer>{

}
