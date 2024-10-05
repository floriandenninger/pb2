package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyi extends aonh implements aoni {
    public static final aqyi a;
    private static volatile aopf o;
    public int b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public apxf m;
    public asuh n;
    private byte p = 2;
    public String c = "";

    static {
        aqyi aqyiVar = new aqyi();
        a = aqyiVar;
        aonm.registerDefaultInstance(aqyi.class, aqyiVar);
    }

    private aqyi() {
    }

    public static /* synthetic */ void a(aqyi aqyiVar) {
        aqyiVar.b |= 2;
        aqyiVar.d = true;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001ϧ\u000b\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ᐉ\t\u0006ဇ\u0004\bဋ\u0006\tဌ\b\nဇ\u0005\u000bဋ\u0007ϧᐉ\n", new Object[]{"b", "c", "d", "e", "f", "m", "g", "i", "k", aquw.t, "h", "j", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqyi();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aqyi.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
