package com.process.shop.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Please provide the full name")
    @Size(min = 10, max = 200)
    private String fullName;
    @NotBlank(message = "Please provide the document")
    @Size(min = 5, max = 10)
    private String document;
    @NotBlank(message = "Please provide the document type")
    private String documentType;
    private LocalDate birthDay;
    private String phoneNumber;
    @NotBlank(message = "Please provide the email")
    @Email(message = "Please provide the email valid")
    private String email;
    @NotBlank(message = "Please provide the password")
    @Size(min = 8, max = 15)
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Address> address;
}
