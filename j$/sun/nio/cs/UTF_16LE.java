package j$.sun.nio.cs;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes5.dex */
public class UTF_16LE extends Unicode {
    @Override // j$.sun.nio.cs.Unicode, java.nio.charset.Charset
    public /* bridge */ /* synthetic */ boolean contains(Charset charset) {
        return super.contains(charset);
    }

    public UTF_16LE() {
        super("UTF-16LE", StandardCharsets.aliases_UTF_16LE());
    }

    @Override // java.nio.charset.Charset
    public CharsetDecoder newDecoder() {
        return new Decoder(this);
    }

    @Override // java.nio.charset.Charset
    public CharsetEncoder newEncoder() {
        return new Encoder(this);
    }

    /* loaded from: classes5.dex */
    class Decoder extends UnicodeDecoder {
        public Decoder(Charset charset) {
            super(charset, 2);
        }
    }

    /* loaded from: classes5.dex */
    class Encoder extends UnicodeEncoder {
        public Encoder(Charset charset) {
            super(charset, 1, false);
        }
    }
}
