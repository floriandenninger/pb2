package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arks extends aonm implements aooz {
    public static final arks a;
    private static volatile aopf l;
    public int b;
    public arnb c;
    public int g;
    public int h;
    public int i;
    public awjw k;
    private arkg m;
    private byte n = 2;
    public aomf d = aomf.b;
    public String e = "";
    public String f = "";
    public String j = "";

    static {
        arks arksVar = new arks();
        a = arksVar;
        aonm.registerDefaultInstance(arks.class, arksVar);
    }

    private arks() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ည\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b\nᐉ\t\u000bᐉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new arks();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (arks.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
