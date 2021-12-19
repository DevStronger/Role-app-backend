ALTER TABLE USER_APPLICATION
ADD firstName VARCHAR(30),
ADD lastName VARCHAR(30),
ADD username VARCHAR(30),
ADD password VARCHAR(30),
ADD email VARCHAR(30),
ADD profileImage VARCHAR(30),
ADD lastLoginDate DATE,
ADD joinDate DATE,
ADD roles VARCHAR ARRAY,
ADD authorities VARCHAR ARRAY,
ADD isActive BOOLEAN,
ADD isNotLocked BOOLEAN;
