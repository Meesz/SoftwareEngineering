package nl.hva.codecs;

import nl.hva.Recordings.Recording;

public class AIFFCodec implements Codec{
    @Override
    public String decode() {
        return "Decoding aiff";
    }

    @Override
    public Recording encode(String title) {
        return new Recording(title, FileType.AIFF);
    }

    @Override
    public FileType getFileType() {
        return FileType.AIFF;
    }

    @Override
    public String getCodecInformation() {
        return CodecDescriptions.AIFF_DESCRIPTION;
    }
}
