package defpackage;

import android.database.sqlite.SQLiteException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class albk extends aldq {
    private final aaea a;
    private final axze b;
    protected final alep d;

    public albk(aaea aaeaVar, avtr avtrVar, akyb akybVar, axze axzeVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(avtrVar, akybVar, alepVar);
        this.a = aaeaVar;
        this.b = axzeVar;
        this.d = alepVar;
    }

    private final akwe s(Throwable th, int i) {
        avtq avtqVar;
        if (th instanceof akwe) {
            return (akwe) th;
        }
        if (th instanceof akwn) {
            return akwe.b(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_DATABASE_EXCEPTION, th);
        }
        if (th instanceof SecurityException) {
            return akwe.b(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_FILE_PERMISSION, th);
        }
        if ((th instanceof IOException) || (th instanceof IndexOutOfBoundsException)) {
            if (th instanceof vrz) {
                vry vryVar = ((vrz) th).a;
                vry vryVar2 = vry.ISO_FILE;
                switch (vryVar) {
                    case ISO_FILE:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_ISO_FILE;
                        break;
                    case GENERATE_OUTPUT_TRACKS:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERATING_OUTPUT_TRACKS;
                        break;
                    case CREATE_MP4_TRACK:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_CREATING_MP4_TRACK;
                        break;
                    case GENERATE_AUDIO_SWAP_TRACKS:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERATING_AUDIO_SWAP_TRACKS;
                        break;
                    case VIDEO_KEY_FRAME_RANGE:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_VIDEO_KEY_FRAME_RANGE;
                        break;
                    case CREATE_CROPPED_TRACK:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_CREATING_CROPPED_TRACK;
                        break;
                    case GENERIC_BUILD_AUDIO_SWAP_FILE:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERIC_BUILD_AUDIO_SWAP_FILE;
                        break;
                    case GENERIC_BUILD_TRIMMED_ISO_FILE:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERIC_BUILD_TRIMMED_ISO_FILE;
                        break;
                    case GENERIC_MOVIE_INPUT_STREAM:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERIC_MOVIE_INPUT_STREAM;
                        break;
                    case MOVIE_INPUT_STREAM_CRC_MISMATCH:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_MOVIE_INPUT_STREAM_CRC_MISMATCH;
                        break;
                    case MOVIE_INPUT_STREAM_READ:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_MOVIE_INPUT_STREAM_READ;
                        break;
                    case AUDIO_MIX_RENDERER:
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_AUDIO_MIX_RENDERER_SETUP;
                        break;
                    default:
                        this.b.d("EditedVideoException missing reason.");
                        avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_UNKNOWN_REASON;
                        break;
                }
                return akwe.b(avtqVar, th);
            }
            if (th instanceof EOFException) {
                return akwe.b(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNEXPECTED_END_OF_FILE, th);
            }
            if (th instanceof FileNotFoundException) {
                return akwe.b(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_FILE_NOT_FOUND, th);
            }
            akwe v = v(th, i);
            return v != null ? v : akwe.b(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SOURCE_FAILED, th);
        }
        if (th instanceof SQLiteException) {
            return akwe.b(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SQL_LITE_EXCEPTION, th);
        }
        if (th instanceof OutOfMemoryError) {
            return akwe.b(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_OUT_OF_MEMORY, th);
        }
        akwe v2 = v(th, i);
        return v2 != null ? v2 : akwe.b(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNHANDLED_EXCEPTION, th);
    }

    private final akwe v(Throwable th, int i) {
        Throwable cause = th.getCause();
        if (cause == null || i <= 0) {
            return null;
        }
        return s(cause, i - 1);
    }

    public abstract anhy c(String str, akwm akwmVar, akzs akzsVar);

    public boolean g() {
        return false;
    }

    public abstract boolean i(akzs akzsVar);

    public akwp k(Throwable th, akzs akzsVar, boolean z) {
        int i = 0;
        if (this.a.a() != null && (this.a.a().b & 4096) != 0) {
            avuj avujVar = this.a.a().h;
            if (avujVar == null) {
                avujVar = avuj.a;
            }
            i = avujVar.B;
        }
        akwe s = s(th, i);
        if (s.a != avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) {
            axze axzeVar = this.b;
            String f = f();
            String message = s.getMessage();
            StringBuilder sb = new StringBuilder(f.length() + 1 + String.valueOf(message).length());
            sb.append(f);
            sb.append(" ");
            sb.append(message);
            String sb2 = sb.toString();
            akzq a = akzq.a(akzsVar.l);
            if (a == null) {
                a = akzq.UNKNOWN_UPLOAD;
            }
            axzeVar.f(sb2, s, a);
        }
        return t(n(akzsVar, s), z);
    }

    @Override // defpackage.aldq
    public final akwp m(Throwable th, String str, akwm akwmVar, boolean z) {
        try {
            akzs b = akwmVar.b(str);
            if (b == null) {
                return t(this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND), z);
            }
            return k(th, b, z);
        } catch (akwn unused) {
            return t(this.d.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_DATABASE_EXCEPTION), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final akzp n(akzs akzsVar, akwe akweVar) {
        if (akweVar.b) {
            alep alepVar = this.d;
            avtq avtqVar = akweVar.a;
            akzp b = b(akzsVar);
            b.getClass();
            return alepVar.o(avtqVar, b, akweVar.c, this.b);
        }
        return this.d.c(akweVar.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akzs o(String str, akwm akwmVar, boolean z) {
        akzs b = akwmVar.b(str);
        if (b != null) {
            if (!z || g() || !b.af) {
                if (i(b)) {
                    return b;
                }
                throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_JOB_STATE);
            }
            throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED);
        }
        throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND);
    }

    @Override // defpackage.aldq
    public final anhy p(final String str, final akwm akwmVar) {
        return anaf.T(new anfy() { // from class: albj
            @Override // defpackage.anfy
            public final anhy a() {
                albk albkVar = albk.this;
                String str2 = str;
                akwm akwmVar2 = akwmVar;
                akzs o = albkVar.o(str2, akwmVar2, true);
                albkVar.q(o);
                return albkVar.c(str2, akwmVar2, o);
            }
        }, angq.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(akzs akzsVar) {
    }
}
