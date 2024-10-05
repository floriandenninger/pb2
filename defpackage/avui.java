package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avui extends aonm implements aooz {
    public static final avui a;
    private static volatile aopf i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    private int j;

    static {
        avui avuiVar = new avui();
        a = avuiVar;
        aonm.registerDefaultInstance(avui.class, avuiVar);
    }

    private avui() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0003\u001d\u0007\u0000\u0000\u0000\u0003ဇ\u0001\tဇ\u0005\nဇ\u0006\u0012ဇ\f\u001aဇ\u0012\u001cဇ\u0014\u001dဇ\u0015", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avui();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (avui.class) {
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
