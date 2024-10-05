package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqg extends aonm implements aooz {
    public static final arqg a;
    private static volatile aopf j;
    public int b;
    public arnb c;
    public int e;
    public boolean g;
    public arqi h;
    public arqm i;
    private byte k = 2;
    public String d = "";
    public String f = "";

    static {
        arqg arqgVar = new arqg();
        a = arqgVar;
        aonm.registerDefaultInstance(arqg.class, arqgVar);
    }

    private arqg() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0010ဉ\t\u0011ဌ\u0002\u0012ဉ\n\u0013ဇ\u0004", new Object[]{"b", "c", "d", "f", "h", "e", aquw.i, "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arqg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (arqg.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
