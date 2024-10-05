package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auij extends aonm implements aooz {
    private static volatile aopf F;
    public static final aonv a = new atpn(6);
    public static final auij b;
    public boolean A;
    public boolean B;
    public apep C;
    public aonu D;
    public boolean E;
    private int G;
    public int c;
    public boolean d;
    public boolean e;
    public asuu f;
    public int g;
    public int h;
    public boolean i;
    public boolean k;
    public boolean m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public float t;
    public int u;
    public float v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;
    public String j = "";
    public String l = "";

    static {
        auij auijVar = new auij();
        b = auijVar;
        aonm.registerDefaultInstance(auij.class, auijVar);
    }

    private auij() {
        emptyIntList();
        this.D = emptyIntList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u001c\u0000\u0002\u0001(\u001c\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0005ဌ\u0004\u0007င\u0006\bဇ\u0007\tဈ\b\nဇ\t\u000bဈ\n\u000eဇ\r\u000fင\u000e\u0010င\u000f\u0011ဇ\u0010\u0014ဇ\u0013\u0015ဇ\u0014\u0016င\u0015\u0017ခ\u0016\u0018င\u0017\u0019ခ\u0018\u001aင\u0019\u001bဇ\u001a\u001cဇ\u001b\u001dဇ\u001c\u001fဇ\u001e ဇ\u001f%ဉ#'\u001e(ဇ%", new Object[]{"c", "G", "d", "e", "f", "g", apqr.p, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", auii.a(), "E"});
            case NEW_MUTABLE_INSTANCE:
                return new auij();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = F;
                if (aopfVar == null) {
                    synchronized (auij.class) {
                        aopfVar = F;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            F = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
