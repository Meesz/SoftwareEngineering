package nl.hva.codecs;

import nl.hva.Recordings.Recording;

public class WAVCodec implements Codec{
    @Override
    public String decode() {
        return "Decoding wav";
    }

    @Override
    public Recording encode(String title) {
        return new Recording(title, FileType.WAV);
    }

    @Override
    public FileType getFileType() {
        return FileType.WAV;
    }

    @Override
    public String getCodecInformation() {
        return CodecDescriptions.WAV_DESCRIPTION;
    }
}
