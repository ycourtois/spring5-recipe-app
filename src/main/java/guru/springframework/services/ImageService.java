package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/15/2017
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
