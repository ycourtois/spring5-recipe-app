package guru.springframework.services;

import guru.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/14/2017
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
