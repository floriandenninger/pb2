package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afdc implements afgj {
    private final List a;

    public afdc(List list) {
        this.a = list;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x004d. Please report as an issue. */
    @Override // defpackage.afgj
    public final String a(long j) {
        StringBuilder sb = new StringBuilder();
        for (afdd afddVar : this.a) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            if (afddVar.b() >= j) {
                double b = afddVar.b() - j;
                Double.isNaN(b);
                sb.append(b / 1000.0d);
            }
            sb.append("-");
            afqu afquVar = afqu.NATIVE_MEDIA_PLAYER;
            afde afdeVar = afde.ATTACH_MEDIA_VIEW;
            switch (afddVar.c()) {
                case ATTACH_MEDIA_VIEW:
                    sb.append("a");
                    break;
                case DETACH_MEDIA_VIEW:
                    sb.append("b");
                    break;
                case SET_LISTENER:
                    sb.append("c");
                    break;
                case SET_NULL_LISTENER:
                    sb.append("d");
                    break;
                case SET_MEDIA_VIEW_TYPE:
                    sb.append("e");
                    sb.append(afddVar.d().ordinal());
                    sb.append("-");
                    if (afddVar.f() instanceof String) {
                        sb.append((String) afddVar.f());
                        break;
                    }
                    break;
                case RESET_MEDIA_VIEW_TYPE:
                    sb.append("f");
                    break;
                case SET_SURFACE:
                    sb.append("g");
                    sb.append(afddVar.a());
                    break;
                case SET_NULL_SURFACE:
                    sb.append("h-");
                    if (afddVar.f() instanceof String) {
                        sb.append((String) afddVar.f());
                        break;
                    }
                    break;
                case SET_SURFACE_HOLDER:
                    sb.append("i");
                    break;
                case LOAD_VIDEO:
                    sb.append("j");
                    break;
                case STOP_VIDEO:
                    sb.append("k");
                    break;
                case BLOCKING_STOP_VIDEO:
                    sb.append("l");
                    break;
                case SURFACE_CREATED:
                    sb.append("m");
                    break;
                case SURFACE_DESTROYED:
                    sb.append("n");
                    break;
                case SURFACE_ERROR:
                    sb.append("o");
                    break;
                case UNEXPECTED_NULL_MEDIA_VIEW_LISTENER:
                    sb.append("p");
                    break;
                case NOT_ON_MAIN_THREAD:
                    sb.append("q");
                    break;
                case DECODER_ERROR:
                    sb.append("r");
                    Object f = afddVar.f();
                    if (f instanceof plp) {
                        double d = ((plp) f).i - j;
                        Double.isNaN(d);
                        sb.append(d / 1000.0d);
                        break;
                    }
                    break;
                case UNEXPECTED_INVALID_SURFACE:
                    sb.append("s");
                    sb.append(afddVar.a());
                    break;
                case SURFACE_BECOMES_VALID:
                    sb.append("t");
                    sb.append(afddVar.a());
                    break;
                case SET_OUTPUT_SURFACE:
                    sb.append("u");
                    if (afddVar.f() instanceof String) {
                        sb.append((String) afddVar.f());
                        break;
                    }
                    break;
            }
            int ordinal = afddVar.e().ordinal();
            if (ordinal == 0) {
                sb.append("A");
            } else if (ordinal == 1) {
                sb.append("B");
            } else if (ordinal == 2) {
                sb.append("C");
            } else {
                sb.append("D");
            }
        }
        sb.insert(0, "e;");
        return sb.toString();
    }
}
