package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxe extends aonm implements aooz {
    public static final arxe a;
    private static volatile aopf f;
    public Object c;
    public arnd d;
    public boolean e;
    private int g;
    private apxf h;
    public int b = 0;
    private byte i = 2;

    static {
        arxe arxeVar = new arxe();
        a = arxeVar;
        aonm.registerDefaultInstance(arxe.class, arxeVar);
    }

    private arxe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐼ\u0000\u0004ဇ\u0003\u0005ᐼ\u0000\u0007ᐉ\u0005", new Object[]{"c", "b", "g", "d", aulq.class, "e", aulq.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arxe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arxe.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
