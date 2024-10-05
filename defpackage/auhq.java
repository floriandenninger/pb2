package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhq extends aonm implements aooz {
    public static final auhq a;
    private static volatile aopf i;
    public int b;
    public auhp c;
    public aulq e;
    public aoxy f;
    private aota j;
    private byte k = 2;
    public aony d = emptyProtobufList();
    public aomf g = aomf.b;
    public String h = "";

    static {
        auhq auhqVar = new auhq();
        a = auhqVar;
        aonm.registerDefaultInstance(auhq.class, auhqVar);
    }

    private auhq() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0002\u0007ဈ\u0005", new Object[]{"b", "c", "d", augu.class, "e", "j", "g", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auhq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auhq.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
