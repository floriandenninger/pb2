package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqxz extends aonh implements aoni {
    private static volatile aopf D;
    public static final aonv a = new uct(18);
    public static final aqxz b;
    public int A;
    public apnq B;
    public float C;
    public int c;
    public int d;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public aqya m;
    public aqya n;
    public long o;
    public long p;
    public int t;
    public int u;
    public apgn v;
    public aqxy w;
    public aqyb x;
    public double y;
    public double z;
    private byte E = 2;
    public String e = "";
    public String f = "";
    public String q = "";
    public aonu r = emptyIntList();
    public String s = "";

    static {
        aqxz aqxzVar = new aqxz();
        b = aqxzVar;
        aonm.registerDefaultInstance(aqxz.class, aqxzVar);
    }

    private aqxz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.E);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.E = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0019\u0000\u0001\u0001/\u0019\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0005ဈ\u0002\u0006င\u0003\u0007င\u0005\bင\u0006\tဉ\b\nဉ\t\u000bဂ\n\fဂ\u000b\u0017ဈ\r\u0018\u001e\u0019င\u0007\u001aဈ\u000e\u001bဌ\u000f\u001cဉ\u0012\u001fင\u0004!ဉ\u0013\"ဉ\u0014#က\u0015%ဌ\u0011&က\u0017)ဌ\u0019*ဉ\u001a/ခ\u001f", new Object[]{"c", "d", "e", "f", "g", "i", "j", "m", "n", "o", "p", "q", "r", asnb.a(), "k", "s", "t", aquw.r, "v", "h", "w", "x", "y", "u", auye.b, "z", "A", aquw.p, "B", "C"});
            case NEW_MUTABLE_INSTANCE:
                return new aqxz();
            case NEW_BUILDER:
                return new aong(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = D;
                if (aopfVar == null) {
                    synchronized (aqxz.class) {
                        aopfVar = D;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            D = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
