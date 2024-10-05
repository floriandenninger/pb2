package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqem extends aonm implements aooz {
    public static final aqem a;
    public static final aonk b;
    private static volatile aopf p;
    public int c;
    public aqyg d;
    public avgg e;
    public int f;
    public apxf n;
    private byte q = 2;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String o = "";

    static {
        aqem aqemVar = new aqem();
        a = aqemVar;
        aonm.registerDefaultInstance(aqem.class, aqemVar);
        b = aonm.newSingularGeneratedExtension(aqik.a, aqemVar, aqemVar, null, 139735787, aoqn.MESSAGE, aqem.class);
    }

    private aqem() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0003\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဌ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0007ဈ\u0007\bဈ\t\tဈ\n\nᐉ\f\fဈ\u000b\rဈ\b\u000eဈ\r", new Object[]{"c", "d", "e", "f", apyu.j, "g", "h", "i", "k", "l", "n", "m", "j", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new aqem();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (aqem.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
