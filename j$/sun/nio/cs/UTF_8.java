package j$.sun.nio.cs;

import j$.lang.DesugarCharacter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes5.dex */
public final class UTF_8 extends Unicode {
    public static final UTF_8 INSTANCE = new UTF_8();

    @Override // j$.sun.nio.cs.Unicode, java.nio.charset.Charset
    public /* bridge */ /* synthetic */ boolean contains(Charset charset) {
        return super.contains(charset);
    }

    public UTF_8() {
        super("UTF-8", StandardCharsets.aliases_UTF_8());
    }

    @Override // java.nio.charset.Charset
    public CharsetDecoder newDecoder() {
        return new Decoder(this);
    }

    @Override // java.nio.charset.Charset
    public CharsetEncoder newEncoder() {
        return new Encoder(this);
    }

    static final void updatePositions(Buffer buffer, int i, Buffer buffer2, int i2) {
        buffer.position(i - buffer.arrayOffset());
        buffer2.position(i2 - buffer2.arrayOffset());
    }

    /* loaded from: classes5.dex */
    class Decoder extends CharsetDecoder {
        private static boolean isMalformed3(int i, int i2, int i3) {
            return ((i != -32 || (i2 & 224) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
        }

        private static boolean isMalformed3_2(int i, int i2) {
            return (i == -32 && (i2 & 224) == 128) || (i2 & 192) != 128;
        }

        private static boolean isMalformed4(int i, int i2, int i3) {
            return ((i & 192) == 128 && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
        }

        private static boolean isMalformed4_2(int i, int i2) {
            return (i == 240 && (i2 < 144 || i2 > 191)) || (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
        }

        private static boolean isMalformed4_3(int i) {
            return (i & 192) != 128;
        }

        private static boolean isNotContinuation(int i) {
            return (i & 192) != 128;
        }

        private Decoder(Charset charset) {
            super(charset, 1.0f, 1.0f);
        }

        private static CoderResult malformedN(ByteBuffer byteBuffer, int i) {
            int i2 = 1;
            if (i == 1 || i == 2) {
                return CoderResult.malformedForLength(1);
            }
            if (i == 3) {
                byte b = byteBuffer.get();
                byte b2 = byteBuffer.get();
                if ((b != -32 || (b2 & 224) != 128) && !isNotContinuation(b2)) {
                    i2 = 2;
                }
                return CoderResult.malformedForLength(i2);
            }
            if (i != 4) {
                return null;
            }
            int i3 = byteBuffer.get() & 255;
            int i4 = byteBuffer.get() & 255;
            if (i3 > 244 || ((i3 == 240 && (i4 < 144 || i4 > 191)) || ((i3 == 244 && (i4 & 240) != 128) || isNotContinuation(i4)))) {
                return CoderResult.malformedForLength(1);
            }
            if (isNotContinuation(byteBuffer.get())) {
                return CoderResult.malformedForLength(2);
            }
            return CoderResult.malformedForLength(3);
        }

        private static CoderResult malformed(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
            CoderResult malformedN = malformedN(byteBuffer, i3);
            UTF_8.updatePositions(byteBuffer, i, charBuffer, i2);
            return malformedN;
        }

        private static CoderResult malformed(ByteBuffer byteBuffer, int i, int i2) {
            CoderResult malformedN = malformedN(byteBuffer, i2);
            return malformedN;
        }

        private static CoderResult malformedForLength(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
            UTF_8.updatePositions(byteBuffer, i, charBuffer, i2);
            return CoderResult.malformedForLength(i3);
        }

        private static CoderResult malformedForLength(ByteBuffer byteBuffer, int i, int i2) {
            return CoderResult.malformedForLength(i2);
        }

        private static CoderResult xflow(Buffer buffer, int i, int i2, Buffer buffer2, int i3, int i4) {
            UTF_8.updatePositions(buffer, i, buffer2, i3);
            return (i4 == 0 || i2 - i < i4) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
        }

        private static CoderResult xflow(Buffer buffer, int i, int i2) {
            buffer.position(i);
            return (i2 == 0 || buffer.remaining() < i2) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
        
            return xflow(r13, r5, r6, r14, r8, 2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x013b, code lost:
        
            return malformed(r13, r5, r14, r8, 4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
        
            r1 = r1 & 255;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0140, code lost:
        
            if (r1 > 244) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
        
            if (r3 <= 1) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
        
            if (isMalformed4_2(r1, r0[r5 + 1] & 255) == false) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
        
            if (r3 <= 2) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
        
            if (isMalformed4_3(r0[r5 + 2]) == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
        
            return malformedForLength(r13, r5, r14, r8, 2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
        
            return xflow(r13, r5, r6, r14, r8, 4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
        
            return malformedForLength(r13, r5, r14, r8, 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x00d6, code lost:
        
            if (r3 <= 1) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x00e0, code lost:
        
            if (isMalformed3_2(r1, r0[r5 + 1]) == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00e6, code lost:
        
            return malformedForLength(r13, r5, r14, r8, 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x00ee, code lost:
        
            return xflow(r13, r5, r6, r14, r8, 3);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.nio.charset.CoderResult decodeArrayLoop(java.nio.ByteBuffer r13, java.nio.CharBuffer r14) {
            /*
                Method dump skipped, instructions count: 380
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.sun.nio.cs.UTF_8.Decoder.decodeArrayLoop(java.nio.ByteBuffer, java.nio.CharBuffer):java.nio.charset.CoderResult");
        }

        private CoderResult decodeBufferLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            while (position < limit) {
                byte b = byteBuffer.get();
                if (b >= 0) {
                    if (charBuffer.remaining() < 1) {
                        return xflow(byteBuffer, position, 1);
                    }
                    charBuffer.put((char) b);
                    position++;
                } else if ((b >> 5) != -2 || (b & 30) == 0) {
                    if ((b >> 4) == -2) {
                        int i = limit - position;
                        if (i < 3 || charBuffer.remaining() < 1) {
                            if (i > 1 && isMalformed3_2(b, byteBuffer.get())) {
                                return malformedForLength(byteBuffer, position, 1);
                            }
                            return xflow(byteBuffer, position, 3);
                        }
                        byte b2 = byteBuffer.get();
                        byte b3 = byteBuffer.get();
                        if (isMalformed3(b, b2, b3)) {
                            return malformed(byteBuffer, position, 3);
                        }
                        char c = (char) (((b << 12) ^ (b2 << 6)) ^ ((-123008) ^ b3));
                        if (DesugarCharacter.isSurrogate(c)) {
                            return malformedForLength(byteBuffer, position, 3);
                        }
                        charBuffer.put(c);
                        position += 3;
                    } else if ((b >> 3) == -2) {
                        int i2 = limit - position;
                        if (i2 < 4 || charBuffer.remaining() < 2) {
                            int i3 = b & 255;
                            if (i3 > 244 || (i2 > 1 && isMalformed4_2(i3, byteBuffer.get() & 255))) {
                                return malformedForLength(byteBuffer, position, 1);
                            }
                            if (i2 > 2 && isMalformed4_3(byteBuffer.get())) {
                                return malformedForLength(byteBuffer, position, 2);
                            }
                            return xflow(byteBuffer, position, 4);
                        }
                        byte b4 = byteBuffer.get();
                        byte b5 = byteBuffer.get();
                        byte b6 = byteBuffer.get();
                        int i4 = (((b << 18) ^ (b4 << 12)) ^ (b5 << 6)) ^ (3678080 ^ b6);
                        if (isMalformed4(b4, b5, b6) || !Character.isSupplementaryCodePoint(i4)) {
                            return malformed(byteBuffer, position, 4);
                        }
                        charBuffer.put(DesugarCharacter.highSurrogate(i4));
                        charBuffer.put(DesugarCharacter.lowSurrogate(i4));
                        position += 4;
                    } else {
                        return malformed(byteBuffer, position, 1);
                    }
                } else {
                    if (limit - position < 2 || charBuffer.remaining() < 1) {
                        return xflow(byteBuffer, position, 2);
                    }
                    byte b7 = byteBuffer.get();
                    if (isNotContinuation(b7)) {
                        return malformedForLength(byteBuffer, position, 1);
                    }
                    charBuffer.put((char) (((b << 6) ^ b7) ^ 3968));
                    position += 2;
                }
            }
            return xflow(byteBuffer, position, 0);
        }

        @Override // java.nio.charset.CharsetDecoder
        protected CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            if (byteBuffer.hasArray() && charBuffer.hasArray()) {
                return decodeArrayLoop(byteBuffer, charBuffer);
            }
            return decodeBufferLoop(byteBuffer, charBuffer);
        }
    }

    /* loaded from: classes5.dex */
    final class Encoder extends CharsetEncoder {
        private Surrogate$Parser sgp;

        private Encoder(Charset charset) {
            super(charset, 1.1f, 3.0f);
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean canEncode(char c) {
            return !DesugarCharacter.isSurrogate(c);
        }

        @Override // java.nio.charset.CharsetEncoder
        public boolean isLegalReplacement(byte[] bArr) {
            return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
        }

        private static CoderResult overflow(CharBuffer charBuffer, int i, ByteBuffer byteBuffer, int i2) {
            UTF_8.updatePositions(charBuffer, i, byteBuffer, i2);
            return CoderResult.OVERFLOW;
        }

        private static CoderResult overflow(CharBuffer charBuffer, int i) {
            return CoderResult.OVERFLOW;
        }

        private CoderResult encodeArrayLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            int i;
            char[] array = charBuffer.array();
            int arrayOffset = charBuffer.arrayOffset() + charBuffer.position();
            int arrayOffset2 = charBuffer.arrayOffset() + charBuffer.limit();
            byte[] array2 = byteBuffer.array();
            int arrayOffset3 = byteBuffer.arrayOffset() + byteBuffer.position();
            int arrayOffset4 = byteBuffer.arrayOffset() + byteBuffer.limit();
            int min = Math.min(arrayOffset2 - arrayOffset, arrayOffset4 - arrayOffset3) + arrayOffset3;
            while (arrayOffset3 < min && array[arrayOffset] < 128) {
                array2[arrayOffset3] = (byte) array[arrayOffset];
                arrayOffset3++;
                arrayOffset++;
            }
            while (arrayOffset < arrayOffset2) {
                char c = array[arrayOffset];
                if (c >= 128) {
                    if (c < 2048) {
                        if (arrayOffset4 - arrayOffset3 < 2) {
                            return overflow(charBuffer, arrayOffset, byteBuffer, arrayOffset3);
                        }
                        int i2 = arrayOffset3 + 1;
                        array2[arrayOffset3] = (byte) ((c >> 6) | 192);
                        arrayOffset3 = i2 + 1;
                        array2[i2] = (byte) ((c & '?') | 128);
                    } else if (DesugarCharacter.isSurrogate(c)) {
                        if (this.sgp == null) {
                            this.sgp = new Surrogate$Parser();
                        }
                        int parse = this.sgp.parse(c, array, arrayOffset, arrayOffset2);
                        if (parse < 0) {
                            UTF_8.updatePositions(charBuffer, arrayOffset, byteBuffer, arrayOffset3);
                            return this.sgp.error();
                        }
                        if (arrayOffset4 - arrayOffset3 < 4) {
                            return overflow(charBuffer, arrayOffset, byteBuffer, arrayOffset3);
                        }
                        int i3 = arrayOffset3 + 1;
                        array2[arrayOffset3] = (byte) ((parse >> 18) | 240);
                        int i4 = i3 + 1;
                        array2[i3] = (byte) (((parse >> 12) & 63) | 128);
                        int i5 = i4 + 1;
                        array2[i4] = (byte) (((parse >> 6) & 63) | 128);
                        arrayOffset3 = i5 + 1;
                        array2[i5] = (byte) ((parse & 63) | 128);
                        arrayOffset++;
                    } else {
                        if (arrayOffset4 - arrayOffset3 < 3) {
                            return overflow(charBuffer, arrayOffset, byteBuffer, arrayOffset3);
                        }
                        int i6 = arrayOffset3 + 1;
                        array2[arrayOffset3] = (byte) ((c >> '\f') | 224);
                        int i7 = i6 + 1;
                        array2[i6] = (byte) (((c >> 6) & 63) | 128);
                        i = i7 + 1;
                        array2[i7] = (byte) ((c & '?') | 128);
                    }
                    arrayOffset++;
                } else {
                    if (arrayOffset3 >= arrayOffset4) {
                        return overflow(charBuffer, arrayOffset, byteBuffer, arrayOffset3);
                    }
                    i = arrayOffset3 + 1;
                    array2[arrayOffset3] = (byte) c;
                }
                arrayOffset3 = i;
                arrayOffset++;
            }
            UTF_8.updatePositions(charBuffer, arrayOffset, byteBuffer, arrayOffset3);
            return CoderResult.UNDERFLOW;
        }

        private CoderResult encodeBufferLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            int position = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                char c = charBuffer.get();
                if (c < 128) {
                    if (!byteBuffer.hasRemaining()) {
                        return overflow(charBuffer, position);
                    }
                    byteBuffer.put((byte) c);
                } else if (c < 2048) {
                    if (byteBuffer.remaining() < 2) {
                        return overflow(charBuffer, position);
                    }
                    byteBuffer.put((byte) ((c >> 6) | 192));
                    byteBuffer.put((byte) ((c & '?') | 128));
                } else if (DesugarCharacter.isSurrogate(c)) {
                    if (this.sgp == null) {
                        this.sgp = new Surrogate$Parser();
                    }
                    int parse = this.sgp.parse(c, charBuffer);
                    if (parse < 0) {
                        return this.sgp.error();
                    }
                    if (byteBuffer.remaining() < 4) {
                        return overflow(charBuffer, position);
                    }
                    byteBuffer.put((byte) ((parse >> 18) | 240));
                    byteBuffer.put((byte) (((parse >> 12) & 63) | 128));
                    byteBuffer.put((byte) (((parse >> 6) & 63) | 128));
                    byteBuffer.put((byte) ((parse & 63) | 128));
                    position++;
                } else {
                    if (byteBuffer.remaining() < 3) {
                        return overflow(charBuffer, position);
                    }
                    byteBuffer.put((byte) ((c >> '\f') | 224));
                    byteBuffer.put((byte) (((c >> 6) & 63) | 128));
                    byteBuffer.put((byte) ((c & '?') | 128));
                }
                position++;
            }
            return CoderResult.UNDERFLOW;
        }

        @Override // java.nio.charset.CharsetEncoder
        protected final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            if (charBuffer.hasArray() && byteBuffer.hasArray()) {
                return encodeArrayLoop(charBuffer, byteBuffer);
            }
            return encodeBufferLoop(charBuffer, byteBuffer);
        }
    }
}
