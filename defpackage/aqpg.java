package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqpg extends aonm implements aooz {
    public static final aqpg a;
    private static volatile aopf m;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public boolean h;
    public aots i;
    public apxf j;
    public arfs k;
    public aqyg l;
    private aqyg n;
    private aqew o;
    private aulq p;
    public int c = 0;
    private byte q = 2;
    public String g = "";

    static {
        aqpg aqpgVar = new aqpg();
        a = aqpgVar;
        aonm.registerDefaultInstance(aqpg.class, aqpgVar);
    }

    private aqpg() {
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
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000f\r\u0000\u0000\b\u0001ᐉ\u0000\u0002ဈ\u0003\u0003ဇ\u0007\u0004ဉ\t\u0006့\u0000\u0007ျ\u0000\bᐉ\u0001\tᐉ\n\nᐉ\u000b\fᐉ\r\rᐉ\u000e\u000eᐉ\u0002\u000fᐉ\u000f", new Object[]{"d", "c", "b", "e", "g", "h", "i", "n", "o", "p", "j", "k", "f", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aqpg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aqpg.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
