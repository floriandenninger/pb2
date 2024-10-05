package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqts extends aonm implements aooz {
    public static final aonv a = new uct(15);
    public static final aqts b;
    private static volatile aopf z;
    public int c;
    public Object e;
    public aqtr f;
    public aqtq g;
    public aulq h;
    public aqtp i;
    public boolean j;
    public int k;
    public int m;
    public int n;
    public apxf q;
    public apxf r;
    public apxf s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public asuh x;
    public aulq y;
    public int d = 0;
    private byte A = 2;
    public aonu l = emptyIntList();
    public aony o = emptyProtobufList();
    public aony p = emptyProtobufList();

    static {
        aqts aqtsVar = new aqts();
        b = aqtsVar;
        aonm.registerDefaultInstance(aqts.class, aqtsVar);
    }

    private aqts() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.A);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0016\u0001\u0001\u0001ϧ\u0016\u0000\u0003\n\u0001ျ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ဉ\u0006\u0005င\u0014\u0006ဇ\u0007\nᐉ\u0005\u000bЛ\fЛ\rဌ\n\u000eဌ\u000b\u000fဇ\u0011\u0010ᐉ\u000e\u0011ဌ\f\u0012ြ\u0000\u0014ဇ\u0012\u0015,\u0016ဌ\u0013\u0017ᐉ\u0010\u0018ᐉ\u000f\u0019ᐉ\u0016ϧᐉ\u0015", new Object[]{"e", "d", "c", "f", "g", "i", "w", "j", "h", "o", apxf.class, "p", apxf.class, "k", aqtk.d, "m", aqtk.c, "t", "q", "n", aqtk.a, aqtn.class, "u", "l", aqtl.a(), "v", aqtk.f, "s", "r", "y", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new aqts();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = z;
                if (aopfVar == null) {
                    synchronized (aqts.class) {
                        aopfVar = z;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            z = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
