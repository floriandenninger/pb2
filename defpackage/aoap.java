package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoap extends aoan {
    public static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new aoao(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    private static void f(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                int position2 = byteBuffer.position();
                int max = Math.max(i, (position - byteBuffer.position()) + 1);
                char charAt2 = charSequence.charAt(i);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(position2 + max);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i == length) {
            return;
        }
        position += i;
        while (i < length) {
            char charAt3 = charSequence.charAt(i);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                int i2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((charAt3 & '?') | 128));
                    position = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i2;
                    int position22 = byteBuffer.position();
                    int max2 = Math.max(i, (position - byteBuffer.position()) + 1);
                    char charAt22 = charSequence.charAt(i);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt22);
                    sb2.append(" at index ");
                    sb2.append(position22 + max2);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else if (charAt3 < 55296 || charAt3 > 57343) {
                int i3 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> '\f') | 224));
                position = i3 + 1;
                byteBuffer.put(i3, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i4 = i + 1;
                if (i4 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i5 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                int i6 = i5 + 1;
                                byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                int i7 = i6 + 1;
                                byteBuffer.put(i6, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i7, (byte) ((codePoint & 63) | 128));
                                position = i7;
                                i = i4;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i5;
                                i = i4;
                                int position222 = byteBuffer.position();
                                int max22 = Math.max(i, (position - byteBuffer.position()) + 1);
                                char charAt222 = charSequence.charAt(i);
                                StringBuilder sb22 = new StringBuilder(37);
                                sb22.append("Failed writing ");
                                sb22.append(charAt222);
                                sb22.append(" at index ");
                                sb22.append(position222 + max22);
                                throw new ArrayIndexOutOfBoundsException(sb22.toString());
                            }
                        } else {
                            i = i4;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                }
                throw new aoao(i, length);
            }
            i++;
            position++;
        }
    }

    @Override // defpackage.aoan
    public final int a(CharSequence charSequence) {
        return e(charSequence);
    }

    @Override // defpackage.aoan
    public final String b(ByteBuffer byteBuffer, int i, int i2) {
        if (!byteBuffer.hasArray()) {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!aobq.g(b)) {
                    break;
                }
                i++;
                aobq.d(b, cArr, i4);
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (aobq.g(b2)) {
                    aobq.d(b2, cArr, i4);
                    i4++;
                    i = i5;
                    while (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (!aobq.g(b3)) {
                            break;
                        }
                        i++;
                        aobq.d(b3, cArr, i4);
                        i4++;
                    }
                } else if (aobq.i(b2)) {
                    if (i5 < i3) {
                        i = i5 + 1;
                        aobq.f(b2, byteBuffer.get(i5), cArr, i4);
                        i4++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (aobq.h(b2)) {
                    if (i5 < i3 - 1) {
                        int i6 = i5 + 1;
                        aobq.e(b2, byteBuffer.get(i5), byteBuffer.get(i6), cArr, i4);
                        i = i6 + 1;
                        i4++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i5 < i3 - 2) {
                    int i7 = i5 + 1;
                    int i8 = i7 + 1;
                    aobq.c(b2, byteBuffer.get(i5), byteBuffer.get(i7), byteBuffer.get(i8), cArr, i4);
                    i4 += 2;
                    i = i8 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i4);
        }
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + i;
        int length = array.length;
        if ((arrayOffset | i2 | ((length - arrayOffset) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(arrayOffset), Integer.valueOf(i2)));
        }
        int i9 = arrayOffset + i2;
        char[] cArr2 = new char[i2];
        int i10 = 0;
        while (arrayOffset < i9) {
            byte b4 = array[arrayOffset];
            if (!aobq.g(b4)) {
                break;
            }
            arrayOffset++;
            aobq.d(b4, cArr2, i10);
            i10++;
        }
        while (arrayOffset < i9) {
            int i11 = arrayOffset + 1;
            byte b5 = array[arrayOffset];
            if (aobq.g(b5)) {
                aobq.d(b5, cArr2, i10);
                i10++;
                arrayOffset = i11;
                while (arrayOffset < i9) {
                    byte b6 = array[arrayOffset];
                    if (!aobq.g(b6)) {
                        break;
                    }
                    arrayOffset++;
                    aobq.d(b6, cArr2, i10);
                    i10++;
                }
            } else if (aobq.i(b5)) {
                if (i11 < i9) {
                    arrayOffset = i11 + 1;
                    aobq.f(b5, array[i11], cArr2, i10);
                    i10++;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            } else if (aobq.h(b5)) {
                if (i11 < i9 - 1) {
                    int i12 = i11 + 1;
                    aobq.e(b5, array[i11], array[i12], cArr2, i10);
                    arrayOffset = i12 + 1;
                    i10++;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            } else if (i11 < i9 - 2) {
                int i13 = i11 + 1;
                int i14 = i13 + 1;
                aobq.c(b5, array[i11], array[i13], array[i14], cArr2, i10);
                i10 += 2;
                arrayOffset = i14 + 1;
            } else {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
        }
        return new String(cArr2, 0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r2 = r2 + r4;
     */
    @Override // defpackage.aoan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.CharSequence r12, java.nio.ByteBuffer r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoap.c(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }
}
