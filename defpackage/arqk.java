package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqk extends aonm implements aooz {
    public static final arqk a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arqk arqkVar = new arqk();
        a = arqkVar;
        aonm.registerDefaultInstance(arqk.class, arqkVar);
    }

    private arqk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf486⢵\ue7fb冰\u0004\u0000\u0000\u0004\uf486⢵ᐼ\u0000\uf730㬮ᐼ\u0000\uf731㬮ᐼ\u0000\ue7fb冰ᐼ\u0000", new Object[]{"c", "b", aqvu.class, arql.class, arqj.class, asmt.class});
            case NEW_MUTABLE_INSTANCE:
                return new arqk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arqk.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
