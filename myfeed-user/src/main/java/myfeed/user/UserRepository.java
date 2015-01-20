package myfeed.user;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Spencer Gibb
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {
}
