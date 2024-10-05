package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anek extends aonm implements aooz {
    public static final anek a;
    private static volatile aopf b;
    private int c;
    private int d;
    private aosl e;
    private aosm f;
    private aosk g;
    private byte h = 2;

    static {
        anek anekVar = new anek();
        a = anekVar;
        aonm.registerDefaultInstance(anek.class, anekVar);
    }

    private anek() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0002!S\u0003\u0000\u0000\u0003!ᐉ\u0007Mᐉ/Sᐉ4", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new anek();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (anek.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
