//Alarm findItemByName(String siteName);

//Alarm findBySiteNameIn(String siteName);// lo mismo
//List<Alarm> findBySiteNameAndId(String site ,String id);
// List<User> findTop3ByAge();
//List<User> findByName(String name);

/***
 * List<User> findByNameIs(String name);
 * List<User> findByNameEquals(String name);
 */
//List<User> findByNameIsNot(String name);
/*
* List<User> findByNameIsNull();
  List<User> findByNameIsNotNull();*/

/***
 * List<User> findByActiveTrue();
 * List<User> findByActiveFalse();
 */
/***
 * List<User> findByNameStartingWith(String prefix);
 * List<User> findByNameEndingWith(String suffix);
 */
/**
 * List<User> findByNameContaining(String infix);
 */
/**
 * List<User> findByNameLike(String likePattern);
 *
 * String likePattern = "a%b%c";
 * userRepository.findByNameLike(likePattern);
 *
 * List<User> findByAgeLessThan(Integer age);
 * List<User> findByAgeLessThanEqual(Integer age);
 *
 * List<User> findByAgeGreaterThan(Integer age);
 * List<User> findByAgeGreaterThanEqual(Integer age);
 * List<User> findByAgeBetween(Integer startAge, Integer endAge);
 * List<User> findByAgeIn(Collection<Integer> ages);
 * List<User> findByNameOrBirthDate(String name, ZonedDateTime birthDate);
 * List<User> findByNameOrBirthDateAndActive(String name, ZonedDateTime birthDate, Boolean active);
 *
 * List<User> findByNameOrderByName(String name);
 * List<User> findByNameOrderByNameAsc(String name);
 * List<User> findByNameOrderByNameDesc(String name);
 * @Query("SELECT f FROM Foo f WHERE LOWER(f.name) = LOWER(:name)")
 * Foo retrieveByName(@Param("name") String name);
 *
 * List<Passenger> findByOrderBySeatNumberAsc();
 * List<Passenger> findByLastNameOrderBySeatNumberAsc(String lastName);
 * List<Passenger> passengers = repository.findAll(Sort.by(Sort.Direction.ASC, "seatNumber"));
 * List<Passenger> findByLastName(String lastName, Sort sort);
 * Page<Passenger> page = repository.findAll(PageRequest.of(0, 1, Sort.by(Sort.Direction.ASC, "seatNumber")));
 * */