package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwg extends aonm implements aooz {
    public static final auwg a;
    private static volatile aopf k;
    public int b;
    public Object d;
    public boolean g;
    public arfs h;
    public boolean i;
    private aulq l;
    private aota m;
    public int c = 0;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public aomf j = aomf.b;

    static {
        auwg auwgVar = new auwg();
        a = auwgVar;
        aonm.registerDefaultInstance(auwg.class, auwgVar);
    }

    private auwg() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000f\u000b\u0000\u0000\u0006\u0001ဈ\u0000\u0002ဇ\u0002\u0003ᐼ\u0000\u0004ᐉ\b\u0005ᐼ\u0000\u0006ᐼ\u0000\bဈ\u0001\tᐉ\n\rည\r\u000eᐉ\u000e\u000fဇ\f", new Object[]{"d", "c", "b", "e", "g", auwi.class, "h", apxf.class, apxf.class, "f", "l", "j", "m", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auwg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (auwg.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
