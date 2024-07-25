package music.service;

import music.dto.MusicDto;
import music.dto.MusicFileDto;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

public interface MusicService {
    List<MusicDto> selectMusicList();
    void insertMusic(MusicDto musicDto, MultipartHttpServletRequest request) throws Exception;
    MusicDto selectMusicDetail(int musicId);
    void updateMusic(MusicDto musicDto);
    void deleteMusic(int musicId);
    MusicFileDto selectMusicFileInfo(int id, int musicId);
}
