package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum vry {
    ISO_FILE("ISO File"),
    GENERATE_OUTPUT_TRACKS("Generating output tracks"),
    CREATE_MP4_TRACK("Create MP4 track"),
    GENERATE_AUDIO_SWAP_TRACKS("Generating audio swap tracks"),
    VIDEO_KEY_FRAME_RANGE("Video key frame range"),
    CREATE_CROPPED_TRACK("Create cropped track"),
    GENERIC_BUILD_AUDIO_SWAP_FILE("Generic build audio swap file"),
    GENERIC_BUILD_TRIMMED_ISO_FILE("Generic build trimmed iso file"),
    GENERIC_MOVIE_INPUT_STREAM("Generic movie input stream"),
    MOVIE_INPUT_STREAM_CRC_MISMATCH("Movie input stream CRC mismatch"),
    MOVIE_INPUT_STREAM_READ("Movie input stream read"),
    AUDIO_MIX_RENDERER("AudioMixRenderer setup");

    public final String m;

    vry(String str) {
        this.m = str;
    }
}
