package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aphf extends aonm implements aooz {
    public static final aphf a;
    private static volatile aopf j;
    public int b;
    public int c;
    public apxf d;
    public aphe e;
    public apxf f;
    public aphe g;
    public apxf h;
    public aphe i;
    private byte k = 2;

    static {
        aphf aphfVar = new aphf();
        a = aphfVar;
        aonm.registerDefaultInstance(aphf.class, aphfVar);
    }

    private aphf() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", apew.l, "d", "f", "h", "e", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aphf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aphf.class) {
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
