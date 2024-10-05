package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baro extends aonm implements aooz {
    public static final baro a;
    private static volatile aopf i;
    public aoot b = aoot.a;
    public aoot c = aoot.a;
    public aony d = emptyProtobufList();
    public aonx e = emptyLongList();
    public aonu f = emptyIntList();
    public aonu g = emptyIntList();
    public aonx h = emptyLongList();

    static {
        baro baroVar = new baro();
        a = baroVar;
        aonm.registerDefaultInstance(baro.class, baroVar);
    }

    private baro() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0000\u0002\n\u0007\u0002\u0005\u0000\u00022\u00032\u0006\u001b\u0007%\b'\t'\n%", new Object[]{"b", barm.a, "c", barn.a, "d", bark.class, "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new baro();
            case NEW_BUILDER:
                return new aone((short[][][]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (baro.class) {
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
