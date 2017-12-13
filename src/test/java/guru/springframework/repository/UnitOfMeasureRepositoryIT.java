package guru.springframework.repository;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/13/2017
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Test
    public void findByDescription() {
        final Optional<UnitOfMeasure> teaspoon = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", teaspoon.get().getDescription());
    }

    @Test
    public void findByDescription_2() {
        final Optional<UnitOfMeasure> teaspoon = unitOfMeasureRepository.findByDescription("Cup");

        assertEquals("Cup", teaspoon.get().getDescription());
    }

    @Test
    public void findByDescription_3() {
        final Optional<UnitOfMeasure> teaspoon = unitOfMeasureRepository.findByDescription("Ounce");

        assertEquals("Ounce", teaspoon.get().getDescription());
    }
}