package nl.hva.codecs;

import nl.hva.Recordings.Recording;

public class AACCodec implements Codec{
    @Override
    public String decode() {
        return "Decoding aac";
    }

    @Override
    public Recording encode(String title) {
        return new Recording(title, FileType.AAC);
    }

    @Override
    public FileType getFileType() {
        return FileType.AAC;
    }

    @Override
    public String getCodecInformation() {
        return CodecDescriptions.AAC_DESCRIPTION;
    }
}
