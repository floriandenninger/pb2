package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhd extends aonm implements aooz {
    public static final auhd a;
    private static volatile aopf i;
    public int b;
    public augz c;
    public aulq e;
    public aoxy f;
    private aota j;
    private aulq k;
    private byte l = 2;
    public aony d = emptyProtobufList();
    public aomf g = aomf.b;
    public String h = "";

    static {
        auhd auhdVar = new auhd();
        a = auhdVar;
        aonm.registerDefaultInstance(auhd.class, auhdVar);
    }

    private auhd() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0005\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007ᐉ\u0005\bဈ\u0006", new Object[]{"b", "c", "d", augu.class, "e", "f", "j", "g", "k", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auhd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auhd.class) {
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
