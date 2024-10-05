package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aveq extends aonm implements aooz {
    public static final aveq a;
    private static volatile aopf h;
    public Object c;
    public avkd e;
    public apni f;
    public apxf g;
    private int i;
    public int b = 0;
    private byte j = 2;
    public String d = "";

    static {
        aveq aveqVar = new aveq();
        a = aveqVar;
        aonm.registerDefaultInstance(aveq.class, aveqVar);
    }

    private aveq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ᐉ\u0004\u0006ြ\u0000", new Object[]{"c", "b", "i", "d", "e", "f", "g", aueu.class});
            case NEW_MUTABLE_INSTANCE:
                return new aveq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aveq.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
