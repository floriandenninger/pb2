package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxm extends aonm implements aooz {
    public static final arxm a;
    private static volatile aopf k;
    public int b;
    public arnb c;
    public int g;
    public arxl i;
    public apgf j;
    private byte l = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public aomf h = aomf.b;

    static {
        arxm arxmVar = new arxm();
        a = arxmVar;
        aonm.registerDefaultInstance(arxm.class, arxmVar);
    }

    private arxm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဈ\u0004\u0007င\u0005\bည\u0006\tဉ\u0007\nဉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new arxm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (arxm.class) {
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
