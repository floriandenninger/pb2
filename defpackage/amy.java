package defpackage;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amy {
    private static final amw[] A;
    private static final amw[] B;
    private static final amw C;
    private static final amw[] D;
    private static final amw[] E;
    private static final amw[] F;
    private static final amw[] G;
    private static final amw[] H;
    private static final HashMap[] I;

    /* renamed from: J, reason: collision with root package name */
    private static final HashMap[] f69J;
    private static final HashSet K;
    private static final HashMap L;
    private static final byte[] M;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final String[] d;
    static final int[] e;
    static final byte[] f;
    static final amw[][] g;
    static final Charset h;
    static final byte[] i;
    private static final byte[] j;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static SimpleDateFormat v;
    private static SimpleDateFormat w;
    private static final amw[] x;
    private static final amw[] y;
    private static final amw[] z;
    private FileDescriptor N;
    private AssetManager.AssetInputStream O;
    private int P;
    private final HashMap[] Q;
    private final Set R;
    private ByteOrder S;
    private boolean T;
    private int U;
    private int V;
    private int W;
    private int X;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        j = new byte[]{102, 116, 121, 112};
        k = new byte[]{109, 105, 102, 49};
        l = new byte[]{104, 101, 105, 99};
        m = new byte[]{79, 76, 89, 77, 80, 0};
        n = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        o = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        p = new byte[]{101, 88, 73, 102};
        q = new byte[]{73, 72, 68, 82};
        r = new byte[]{73, 69, 78, 68};
        s = new byte[]{82, 73, 70, 70};
        t = new byte[]{87, 69, 66, 80};
        u = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        e = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        amw[] amwVarArr = {new amw("NewSubfileType", 254, 4), new amw("SubfileType", PrivateKeyType.INVALID, 4), new amw("ImageWidth", 256, 3, 4), new amw("ImageLength", 257, 3, 4), new amw("BitsPerSample", 258, 3), new amw("Compression", 259, 3), new amw("PhotometricInterpretation", 262, 3), new amw("ImageDescription", 270, 2), new amw("Make", 271, 2), new amw("Model", 272, 2), new amw("StripOffsets", 273, 3, 4), new amw("Orientation", 274, 3), new amw("SamplesPerPixel", 277, 3), new amw("RowsPerStrip", 278, 3, 4), new amw("StripByteCounts", 279, 3, 4), new amw("XResolution", 282, 5), new amw("YResolution", 283, 5), new amw("PlanarConfiguration", 284, 3), new amw("ResolutionUnit", 296, 3), new amw("TransferFunction", 301, 3), new amw("Software", 305, 2), new amw("DateTime", 306, 2), new amw("Artist", 315, 2), new amw("WhitePoint", 318, 5), new amw("PrimaryChromaticities", 319, 5), new amw("SubIFDPointer", 330, 4), new amw("JPEGInterchangeFormat", 513, 4), new amw("JPEGInterchangeFormatLength", 514, 4), new amw("YCbCrCoefficients", 529, 5), new amw("YCbCrSubSampling", 530, 3), new amw("YCbCrPositioning", 531, 3), new amw("ReferenceBlackWhite", 532, 5), new amw("Copyright", 33432, 2), new amw("ExifIFDPointer", 34665, 4), new amw("GPSInfoIFDPointer", 34853, 4), new amw("SensorTopBorder", 4, 4), new amw("SensorLeftBorder", 5, 4), new amw("SensorBottomBorder", 6, 4), new amw("SensorRightBorder", 7, 4), new amw("ISO", 23, 3), new amw("JpgFromRaw", 46, 7), new amw("Xmp", 700, 1)};
        x = amwVarArr;
        amw[] amwVarArr2 = {new amw("ExposureTime", 33434, 5), new amw("FNumber", 33437, 5), new amw("ExposureProgram", 34850, 3), new amw("SpectralSensitivity", 34852, 2), new amw("PhotographicSensitivity", 34855, 3), new amw("OECF", 34856, 7), new amw("SensitivityType", 34864, 3), new amw("StandardOutputSensitivity", 34865, 4), new amw("RecommendedExposureIndex", 34866, 4), new amw("ISOSpeed", 34867, 4), new amw("ISOSpeedLatitudeyyy", 34868, 4), new amw("ISOSpeedLatitudezzz", 34869, 4), new amw("ExifVersion", 36864, 2), new amw("DateTimeOriginal", 36867, 2), new amw("DateTimeDigitized", 36868, 2), new amw("OffsetTime", 36880, 2), new amw("OffsetTimeOriginal", 36881, 2), new amw("OffsetTimeDigitized", 36882, 2), new amw("ComponentsConfiguration", 37121, 7), new amw("CompressedBitsPerPixel", 37122, 5), new amw("ShutterSpeedValue", 37377, 10), new amw("ApertureValue", 37378, 5), new amw("BrightnessValue", 37379, 10), new amw("ExposureBiasValue", 37380, 10), new amw("MaxApertureValue", 37381, 5), new amw("SubjectDistance", 37382, 5), new amw("MeteringMode", 37383, 3), new amw("LightSource", 37384, 3), new amw("Flash", 37385, 3), new amw("FocalLength", 37386, 5), new amw("SubjectArea", 37396, 3), new amw("MakerNote", 37500, 7), new amw("UserComment", 37510, 7), new amw("SubSecTime", 37520, 2), new amw("SubSecTimeOriginal", 37521, 2), new amw("SubSecTimeDigitized", 37522, 2), new amw("FlashpixVersion", 40960, 7), new amw("ColorSpace", 40961, 3), new amw("PixelXDimension", 40962, 3, 4), new amw("PixelYDimension", 40963, 3, 4), new amw("RelatedSoundFile", 40964, 2), new amw("InteroperabilityIFDPointer", 40965, 4), new amw("FlashEnergy", 41483, 5), new amw("SpatialFrequencyResponse", 41484, 7), new amw("FocalPlaneXResolution", 41486, 5), new amw("FocalPlaneYResolution", 41487, 5), new amw("FocalPlaneResolutionUnit", 41488, 3), new amw("SubjectLocation", 41492, 3), new amw("ExposureIndex", 41493, 5), new amw("SensingMethod", 41495, 3), new amw("FileSource", 41728, 7), new amw("SceneType", 41729, 7), new amw("CFAPattern", 41730, 7), new amw("CustomRendered", 41985, 3), new amw("ExposureMode", 41986, 3), new amw("WhiteBalance", 41987, 3), new amw("DigitalZoomRatio", 41988, 5), new amw("FocalLengthIn35mmFilm", 41989, 3), new amw("SceneCaptureType", 41990, 3), new amw("GainControl", 41991, 3), new amw("Contrast", 41992, 3), new amw("Saturation", 41993, 3), new amw("Sharpness", 41994, 3), new amw("DeviceSettingDescription", 41995, 7), new amw("SubjectDistanceRange", 41996, 3), new amw("ImageUniqueID", 42016, 2), new amw("CameraOwnerName", 42032, 2), new amw("BodySerialNumber", 42033, 2), new amw("LensSpecification", 42034, 5), new amw("LensMake", 42035, 2), new amw("LensModel", 42036, 2), new amw("Gamma", 42240, 5), new amw("DNGVersion", 50706, 1), new amw("DefaultCropSize", 50720, 3, 4)};
        y = amwVarArr2;
        amw[] amwVarArr3 = {new amw("GPSVersionID", 0, 1), new amw("GPSLatitudeRef", 1, 2), new amw("GPSLatitude", 2, 5, 10), new amw("GPSLongitudeRef", 3, 2), new amw("GPSLongitude", 4, 5, 10), new amw("GPSAltitudeRef", 5, 1), new amw("GPSAltitude", 6, 5), new amw("GPSTimeStamp", 7, 5), new amw("GPSSatellites", 8, 2), new amw("GPSStatus", 9, 2), new amw("GPSMeasureMode", 10, 2), new amw("GPSDOP", 11, 5), new amw("GPSSpeedRef", 12, 2), new amw("GPSSpeed", 13, 5), new amw("GPSTrackRef", 14, 2), new amw("GPSTrack", 15, 5), new amw("GPSImgDirectionRef", 16, 2), new amw("GPSImgDirection", 17, 5), new amw("GPSMapDatum", 18, 2), new amw("GPSDestLatitudeRef", 19, 2), new amw("GPSDestLatitude", 20, 5), new amw("GPSDestLongitudeRef", 21, 2), new amw("GPSDestLongitude", 22, 5), new amw("GPSDestBearingRef", 23, 2), new amw("GPSDestBearing", 24, 5), new amw("GPSDestDistanceRef", 25, 2), new amw("GPSDestDistance", 26, 5), new amw("GPSProcessingMethod", 27, 7), new amw("GPSAreaInformation", 28, 7), new amw("GPSDateStamp", 29, 2), new amw("GPSDifferential", 30, 3), new amw("GPSHPositioningError", 31, 5)};
        z = amwVarArr3;
        amw[] amwVarArr4 = {new amw("InteroperabilityIndex", 1, 2)};
        A = amwVarArr4;
        amw[] amwVarArr5 = {new amw("NewSubfileType", 254, 4), new amw("SubfileType", PrivateKeyType.INVALID, 4), new amw("ThumbnailImageWidth", 256, 3, 4), new amw("ThumbnailImageLength", 257, 3, 4), new amw("BitsPerSample", 258, 3), new amw("Compression", 259, 3), new amw("PhotometricInterpretation", 262, 3), new amw("ImageDescription", 270, 2), new amw("Make", 271, 2), new amw("Model", 272, 2), new amw("StripOffsets", 273, 3, 4), new amw("ThumbnailOrientation", 274, 3), new amw("SamplesPerPixel", 277, 3), new amw("RowsPerStrip", 278, 3, 4), new amw("StripByteCounts", 279, 3, 4), new amw("XResolution", 282, 5), new amw("YResolution", 283, 5), new amw("PlanarConfiguration", 284, 3), new amw("ResolutionUnit", 296, 3), new amw("TransferFunction", 301, 3), new amw("Software", 305, 2), new amw("DateTime", 306, 2), new amw("Artist", 315, 2), new amw("WhitePoint", 318, 5), new amw("PrimaryChromaticities", 319, 5), new amw("SubIFDPointer", 330, 4), new amw("JPEGInterchangeFormat", 513, 4), new amw("JPEGInterchangeFormatLength", 514, 4), new amw("YCbCrCoefficients", 529, 5), new amw("YCbCrSubSampling", 530, 3), new amw("YCbCrPositioning", 531, 3), new amw("ReferenceBlackWhite", 532, 5), new amw("Xmp", 700, 1), new amw("Copyright", 33432, 2), new amw("ExifIFDPointer", 34665, 4), new amw("GPSInfoIFDPointer", 34853, 4), new amw("DNGVersion", 50706, 1), new amw("DefaultCropSize", 50720, 3, 4)};
        B = amwVarArr5;
        C = new amw("StripOffsets", 273, 3);
        amw[] amwVarArr6 = {new amw("ThumbnailImage", 256, 7), new amw("CameraSettingsIFDPointer", 8224, 4), new amw("ImageProcessingIFDPointer", 8256, 4)};
        D = amwVarArr6;
        amw[] amwVarArr7 = {new amw("PreviewImageStart", 257, 4), new amw("PreviewImageLength", 258, 4)};
        E = amwVarArr7;
        amw[] amwVarArr8 = {new amw("AspectFrame", 4371, 3)};
        F = amwVarArr8;
        amw[] amwVarArr9 = {new amw("ColorSpace", 55, 3)};
        G = amwVarArr9;
        g = new amw[][]{amwVarArr, amwVarArr2, amwVarArr3, amwVarArr4, amwVarArr5, amwVarArr, amwVarArr6, amwVarArr7, amwVarArr8, amwVarArr9};
        H = new amw[]{new amw("SubIFDPointer", 330, 4), new amw("ExifIFDPointer", 34665, 4), new amw("GPSInfoIFDPointer", 34853, 4), new amw("InteroperabilityIFDPointer", 40965, 4), new amw("CameraSettingsIFDPointer", 8224, 1), new amw("ImageProcessingIFDPointer", 8256, 1)};
        I = new HashMap[10];
        f69J = new HashMap[10];
        K = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        L = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        h = forName;
        i = "Exif\u0000\u0000".getBytes(forName);
        M = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        v = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        w = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            amw[][] amwVarArr10 = g;
            int length = amwVarArr10.length;
            if (i2 >= 10) {
                HashMap hashMap = L;
                amw[] amwVarArr11 = H;
                hashMap.put(Integer.valueOf(amwVarArr11[0].a), 5);
                hashMap.put(Integer.valueOf(amwVarArr11[1].a), 1);
                hashMap.put(Integer.valueOf(amwVarArr11[2].a), 2);
                hashMap.put(Integer.valueOf(amwVarArr11[3].a), 3);
                hashMap.put(Integer.valueOf(amwVarArr11[4].a), 7);
                hashMap.put(Integer.valueOf(amwVarArr11[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            I[i2] = new HashMap();
            f69J[i2] = new HashMap();
            for (amw amwVar : amwVarArr10[i2]) {
                I[i2].put(Integer.valueOf(amwVar.a), amwVar);
                f69J[i2].put(amwVar.b, amwVar);
            }
            i2++;
        }
    }

    public amy(InputStream inputStream) {
        amw[][] amwVarArr = g;
        int length = amwVarArr.length;
        this.Q = new HashMap[10];
        int length2 = amwVarArr.length;
        this.R = new HashSet(10);
        this.S = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.O = (AssetManager.AssetInputStream) inputStream;
            this.N = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    amz.a(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.O = null;
                    this.N = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.O = null;
            this.N = null;
        }
        i(inputStream);
    }

    private final amv c(String str) {
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        while (true) {
            int length = g.length;
            if (i2 >= 10) {
                return null;
            }
            amv amvVar = (amv) this.Q[i2].get(str);
            if (amvVar != null) {
                return amvVar;
            }
            i2++;
        }
    }

    private final void d() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null && a("DateTime") == null) {
            this.Q[0].put("DateTime", amv.b(a2));
        }
        if (a("ImageWidth") == null) {
            this.Q[0].put("ImageWidth", amv.c(0L, this.S));
        }
        if (a("ImageLength") == null) {
            this.Q[0].put("ImageLength", amv.c(0L, this.S));
        }
        if (a("Orientation") == null) {
            this.Q[0].put("Orientation", amv.c(0L, this.S));
        }
        if (a("LightSource") == null) {
            this.Q[1].put("LightSource", amv.c(0L, this.S));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        r20.b = r19.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010c A[LOOP:0: B:6:0x001c->B:23:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(defpackage.amu r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amy.e(amu, int, int):void");
    }

    private final void f(amu amuVar) {
        amuVar.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = o;
        int length = bArr.length;
        amuVar.b(8);
        int length2 = bArr.length;
        int i2 = 8;
        while (true) {
            try {
                int readInt = amuVar.readInt();
                byte[] bArr2 = new byte[4];
                if (amuVar.read(bArr2) == 4) {
                    int i3 = i2 + 8;
                    if (i3 == 16) {
                        if (!Arrays.equals(bArr2, q)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                        i3 = 16;
                    }
                    if (Arrays.equals(bArr2, r)) {
                        return;
                    }
                    if (!Arrays.equals(bArr2, p)) {
                        int i4 = readInt + 4;
                        amuVar.b(i4);
                        i2 = i3 + i4;
                    } else {
                        byte[] bArr3 = new byte[readInt];
                        if (amuVar.read(bArr3) != readInt) {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + amz.b(bArr2));
                        }
                        int readInt2 = amuVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) != readInt2) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        this.U = i3;
                        k(bArr3, 0);
                        o();
                        m(new amu(bArr3));
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private final void g(amu amuVar) {
        amuVar.b = ByteOrder.LITTLE_ENDIAN;
        int length = s.length;
        amuVar.b(4);
        int readInt = amuVar.readInt() + 8;
        byte[] bArr = t;
        int length2 = bArr.length;
        amuVar.b(4);
        int length3 = bArr.length;
        int i2 = 12;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (amuVar.read(bArr2) == 4) {
                    int readInt2 = amuVar.readInt();
                    int i3 = i2 + 8;
                    if (Arrays.equals(u, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (amuVar.read(bArr3) != readInt2) {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + amz.b(bArr2));
                        }
                        this.U = i3;
                        k(bArr3, 0);
                        m(new amu(bArr3));
                        return;
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    i2 = i3 + readInt2;
                    if (i2 == readInt) {
                        return;
                    }
                    if (i2 <= readInt) {
                        amuVar.b(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private final void h(amu amuVar, HashMap hashMap) {
        amv amvVar = (amv) hashMap.get("JPEGInterchangeFormat");
        amv amvVar2 = (amv) hashMap.get("JPEGInterchangeFormatLength");
        if (amvVar == null || amvVar2 == null) {
            return;
        }
        int a2 = amvVar.a(this.S);
        int a3 = amvVar2.a(this.S);
        if (this.P == 7) {
            a2 += this.V;
        }
        if (a2 <= 0 || a3 <= 0 || this.O != null || this.N != null) {
            return;
        }
        amuVar.skip(a2);
        amuVar.read(new byte[a3]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x00e7, code lost:
    
        if (r6 == null) goto L262;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0427 A[Catch: all -> 0x04c9, IOException | UnsupportedOperationException -> 0x04ce, IOException | UnsupportedOperationException -> 0x04ce, TryCatch #2 {all -> 0x04c9, blocks: (B:3:0x0005, B:5:0x000c, B:7:0x0018, B:8:0x002d, B:10:0x0040, B:14:0x0046, B:15:0x0051, B:17:0x0054, B:25:0x0071, B:35:0x0107, B:38:0x0199, B:44:0x01aa, B:46:0x01b7, B:48:0x01bd, B:89:0x02bd, B:90:0x0413, B:98:0x02cc, B:99:0x02cf, B:102:0x02d0, B:103:0x02d7, B:106:0x02db, B:108:0x02ec, B:110:0x0315, B:111:0x0326, B:114:0x0346, B:115:0x0358, B:117:0x0366, B:119:0x0370, B:122:0x0374, B:124:0x037c, B:126:0x0383, B:128:0x038b, B:129:0x038f, B:130:0x03ab, B:131:0x031b, B:133:0x0321, B:136:0x03ca, B:138:0x03dc, B:139:0x03e9, B:142:0x0406, B:143:0x0410, B:144:0x041e, B:146:0x0427, B:148:0x042f, B:150:0x0436, B:152:0x0487, B:156:0x0495, B:154:0x04b9, B:159:0x04c2, B:165:0x0132, B:169:0x014f, B:171:0x0154, B:176:0x015b, B:178:0x0160, B:180:0x0168, B:185:0x016c, B:187:0x0171, B:189:0x017d, B:173:0x0183, B:203:0x0144, B:204:0x0147, B:199:0x014b, B:216:0x0117, B:217:0x011a, B:212:0x011e, B:242:0x00d4, B:249:0x00cd, B:265:0x00e2, B:266:0x00e5, B:19:0x0189, B:12:0x0192), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0154 A[Catch: all -> 0x04c9, IOException | UnsupportedOperationException -> 0x04ce, IOException | UnsupportedOperationException -> 0x04ce, TryCatch #2 {all -> 0x04c9, blocks: (B:3:0x0005, B:5:0x000c, B:7:0x0018, B:8:0x002d, B:10:0x0040, B:14:0x0046, B:15:0x0051, B:17:0x0054, B:25:0x0071, B:35:0x0107, B:38:0x0199, B:44:0x01aa, B:46:0x01b7, B:48:0x01bd, B:89:0x02bd, B:90:0x0413, B:98:0x02cc, B:99:0x02cf, B:102:0x02d0, B:103:0x02d7, B:106:0x02db, B:108:0x02ec, B:110:0x0315, B:111:0x0326, B:114:0x0346, B:115:0x0358, B:117:0x0366, B:119:0x0370, B:122:0x0374, B:124:0x037c, B:126:0x0383, B:128:0x038b, B:129:0x038f, B:130:0x03ab, B:131:0x031b, B:133:0x0321, B:136:0x03ca, B:138:0x03dc, B:139:0x03e9, B:142:0x0406, B:143:0x0410, B:144:0x041e, B:146:0x0427, B:148:0x042f, B:150:0x0436, B:152:0x0487, B:156:0x0495, B:154:0x04b9, B:159:0x04c2, B:165:0x0132, B:169:0x014f, B:171:0x0154, B:176:0x015b, B:178:0x0160, B:180:0x0168, B:185:0x016c, B:187:0x0171, B:189:0x017d, B:173:0x0183, B:203:0x0144, B:204:0x0147, B:199:0x014b, B:216:0x0117, B:217:0x011a, B:212:0x011e, B:242:0x00d4, B:249:0x00cd, B:265:0x00e2, B:266:0x00e5, B:19:0x0189, B:12:0x0192), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(java.io.InputStream r26) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amy.i(java.io.InputStream):void");
    }

    private final void j(amu amuVar) {
        ByteOrder t2 = t(amuVar);
        this.S = t2;
        amuVar.b = t2;
        int readUnsignedShort = amuVar.readUnsignedShort();
        int i2 = this.P;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = amuVar.readInt();
            if (readInt < 8) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0) {
                amuVar.b(i3);
                return;
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private final void k(byte[] bArr, int i2) {
        amu amuVar = new amu(bArr, (byte[]) null);
        j(amuVar);
        r(amuVar, i2);
    }

    private final void l(int i2, String str, String str2) {
        if (this.Q[i2].isEmpty() || this.Q[i2].get(str) == null) {
            return;
        }
        HashMap hashMap = this.Q[i2];
        hashMap.put(str2, (amv) hashMap.get(str));
        this.Q[i2].remove(str);
    }

    private final void m(amu amuVar) {
        int length;
        int length2;
        amv amvVar;
        HashMap hashMap = this.Q[4];
        amv amvVar2 = (amv) hashMap.get("Compression");
        if (amvVar2 != null) {
            int a2 = amvVar2.a(this.S);
            if (a2 != 1) {
                if (a2 == 6) {
                    h(amuVar, hashMap);
                    return;
                } else if (a2 != 7) {
                    return;
                }
            }
            amv amvVar3 = (amv) hashMap.get("BitsPerSample");
            if (amvVar3 == null) {
                return;
            }
            int[] iArr = (int[]) amvVar3.f(this.S);
            int[] iArr2 = a;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.P != 3 || (amvVar = (amv) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int a3 = amvVar.a(this.S);
                if (a3 != 1) {
                    if (a3 != 6 || !Arrays.equals(iArr, iArr2)) {
                        return;
                    }
                } else if (!Arrays.equals(iArr, b)) {
                    return;
                }
            }
            amv amvVar4 = (amv) hashMap.get("StripOffsets");
            amv amvVar5 = (amv) hashMap.get("StripByteCounts");
            if (amvVar4 == null || amvVar5 == null) {
                return;
            }
            long[] d2 = amz.d(amvVar4.f(this.S));
            long[] d3 = amz.d(amvVar5.f(this.S));
            if (d2 == null || (length = d2.length) == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (d3 == null || (length2 = d3.length) == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (length == length2) {
                long j2 = 0;
                for (long j3 : d3) {
                    j2 += j3;
                }
                byte[] bArr = new byte[(int) j2];
                this.T = true;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int length3 = d2.length;
                    if (i2 >= length3) {
                        if (this.T) {
                            long j4 = d2[0];
                            return;
                        }
                        return;
                    }
                    int i5 = (int) d2[i2];
                    int i6 = (int) d3[i2];
                    if (i2 < length3 - 1 && i5 + i6 != d2[i2 + 1]) {
                        this.T = false;
                    }
                    int i7 = i5 - i3;
                    if (i7 < 0) {
                        return;
                    }
                    long j5 = i7;
                    if (amuVar.skip(j5) != j5) {
                        return;
                    }
                    int i8 = i3 + i7;
                    byte[] bArr2 = new byte[i6];
                    if (amuVar.read(bArr2) != i6) {
                        return;
                    }
                    i3 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i4, i6);
                    i4 += i6;
                    i2++;
                }
            } else {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            }
        } else {
            h(amuVar, hashMap);
        }
    }

    private final void n(int i2, int i3) {
        if (this.Q[i2].isEmpty() || this.Q[i3].isEmpty()) {
            return;
        }
        amv amvVar = (amv) this.Q[i2].get("ImageLength");
        amv amvVar2 = (amv) this.Q[i2].get("ImageWidth");
        amv amvVar3 = (amv) this.Q[i3].get("ImageLength");
        amv amvVar4 = (amv) this.Q[i3].get("ImageWidth");
        if (amvVar == null || amvVar2 == null || amvVar3 == null || amvVar4 == null) {
            return;
        }
        int a2 = amvVar.a(this.S);
        int a3 = amvVar2.a(this.S);
        int a4 = amvVar3.a(this.S);
        int a5 = amvVar4.a(this.S);
        if (a2 >= a4 || a3 >= a5) {
            return;
        }
        HashMap[] hashMapArr = this.Q;
        HashMap hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    private final void o() {
        n(0, 5);
        n(0, 4);
        n(5, 4);
        amv amvVar = (amv) this.Q[1].get("PixelXDimension");
        amv amvVar2 = (amv) this.Q[1].get("PixelYDimension");
        if (amvVar != null && amvVar2 != null) {
            this.Q[0].put("ImageWidth", amvVar);
            this.Q[0].put("ImageLength", amvVar2);
        }
        if (this.Q[4].isEmpty() && p(this.Q[5])) {
            HashMap[] hashMapArr = this.Q;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        p(this.Q[4]);
        l(0, "ThumbnailOrientation", "Orientation");
        l(0, "ThumbnailImageLength", "ImageLength");
        l(0, "ThumbnailImageWidth", "ImageWidth");
        l(5, "ThumbnailOrientation", "Orientation");
        l(5, "ThumbnailImageLength", "ImageLength");
        l(5, "ThumbnailImageWidth", "ImageWidth");
        l(4, "Orientation", "ThumbnailOrientation");
        l(4, "ImageLength", "ThumbnailImageLength");
        l(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean p(HashMap hashMap) {
        amv amvVar = (amv) hashMap.get("ImageLength");
        amv amvVar2 = (amv) hashMap.get("ImageWidth");
        if (amvVar == null || amvVar2 == null) {
            return false;
        }
        return amvVar.a(this.S) <= 512 && amvVar2.a(this.S) <= 512;
    }

    private final void q(amu amuVar) {
        amv amvVar;
        j(amuVar);
        r(amuVar, 0);
        s(amuVar, 0);
        s(amuVar, 5);
        s(amuVar, 4);
        o();
        if (this.P != 8 || (amvVar = (amv) this.Q[1].get("MakerNote")) == null) {
            return;
        }
        amu amuVar2 = new amu(amvVar.d, (byte[]) null);
        amuVar2.b = this.S;
        amuVar2.b(6);
        r(amuVar2, 9);
        amv amvVar2 = (amv) this.Q[9].get("ColorSpace");
        if (amvVar2 != null) {
            this.Q[1].put("ColorSpace", amvVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0065, code lost:
    
        if (r7 != 9) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0069, code lost:
    
        if (r10 != 8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x005f, code lost:
    
        if (r10 != 3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(defpackage.amu r25, int r26) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amy.r(amu, int):void");
    }

    private final void s(amu amuVar, int i2) {
        amv e2;
        amv e3;
        amv amvVar = (amv) this.Q[i2].get("DefaultCropSize");
        amv amvVar2 = (amv) this.Q[i2].get("SensorTopBorder");
        amv amvVar3 = (amv) this.Q[i2].get("SensorLeftBorder");
        amv amvVar4 = (amv) this.Q[i2].get("SensorBottomBorder");
        amv amvVar5 = (amv) this.Q[i2].get("SensorRightBorder");
        if (amvVar != null) {
            if (amvVar.a == 5) {
                amx[] amxVarArr = (amx[]) amvVar.f(this.S);
                if (amxVarArr == null || amxVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(amxVarArr));
                    return;
                }
                e2 = amv.d(amxVarArr[0], this.S);
                e3 = amv.d(amxVarArr[1], this.S);
            } else {
                int[] iArr = (int[]) amvVar.f(this.S);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                e2 = amv.e(iArr[0], this.S);
                e3 = amv.e(iArr[1], this.S);
            }
            this.Q[i2].put("ImageWidth", e2);
            this.Q[i2].put("ImageLength", e3);
            return;
        }
        if (amvVar2 == null || amvVar3 == null || amvVar4 == null || amvVar5 == null) {
            amv amvVar6 = (amv) this.Q[i2].get("ImageLength");
            amv amvVar7 = (amv) this.Q[i2].get("ImageWidth");
            if (amvVar6 == null || amvVar7 == null) {
                amv amvVar8 = (amv) this.Q[i2].get("JPEGInterchangeFormat");
                amv amvVar9 = (amv) this.Q[i2].get("JPEGInterchangeFormatLength");
                if (amvVar8 == null || amvVar9 == null) {
                    return;
                }
                int a2 = amvVar8.a(this.S);
                int a3 = amvVar8.a(this.S);
                amuVar.c(a2);
                byte[] bArr = new byte[a3];
                amuVar.read(bArr);
                e(new amu(bArr), a2, i2);
                return;
            }
            return;
        }
        int a4 = amvVar2.a(this.S);
        int a5 = amvVar4.a(this.S);
        int a6 = amvVar5.a(this.S);
        int a7 = amvVar3.a(this.S);
        if (a5 <= a4 || a6 <= a7) {
            return;
        }
        amv e4 = amv.e(a5 - a4, this.S);
        amv e5 = amv.e(a6 - a7, this.S);
        this.Q[i2].put("ImageLength", e4);
        this.Q[i2].put("ImageWidth", e5);
    }

    private static final ByteOrder t(amu amuVar) {
        short readShort = amuVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final String a(String str) {
        double d2;
        amv c2 = c(str);
        if (c2 != null) {
            if (!K.contains(str)) {
                return c2.g(this.S);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = c2.a;
                if (i2 == 5 || i2 == 10) {
                    amx[] amxVarArr = (amx[]) c2.f(this.S);
                    if (amxVarArr == null || amxVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(amxVarArr));
                        return null;
                    }
                    amx amxVar = amxVarArr[0];
                    amx amxVar2 = amxVarArr[1];
                    amx amxVar3 = amxVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) amxVar.a) / ((float) amxVar.b))), Integer.valueOf((int) (((float) amxVar2.a) / ((float) amxVar2.b))), Integer.valueOf((int) (((float) amxVar3.a) / ((float) amxVar3.b))));
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + c2.a);
                return null;
            }
            try {
                Object f2 = c2.f(this.S);
                if (f2 == null) {
                    throw new NumberFormatException("NULL can't be converted to a double value");
                }
                if (f2 instanceof String) {
                    d2 = Double.parseDouble((String) f2);
                } else if (f2 instanceof long[]) {
                    long[] jArr = (long[]) f2;
                    if (jArr.length == 1) {
                        d2 = jArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof int[]) {
                    int[] iArr = (int[]) f2;
                    if (iArr.length == 1) {
                        d2 = iArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof double[]) {
                    double[] dArr = (double[]) f2;
                    if (dArr.length == 1) {
                        d2 = dArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof amx[]) {
                    amx[] amxVarArr2 = (amx[]) f2;
                    if (amxVarArr2.length == 1) {
                        amx amxVar4 = amxVarArr2[0];
                        double d3 = amxVar4.a;
                        double d4 = amxVar4.b;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        d2 = d3 / d4;
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                return Double.toString(d2);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int b() {
        amv c2 = c("Orientation");
        if (c2 == null) {
            return 1;
        }
        try {
            return c2.a(this.S);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }
}
