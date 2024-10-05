package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgf extends aonh implements tgg {
    public static final tgf a;
    private static volatile aopf i;
    public int b;
    public ando d;
    public int e;
    public long f;
    public long g;
    public long h;
    private byte j = 2;
    public aonu c = emptyIntList();

    static {
        tgf tgfVar = new tgf();
        a = tgfVar;
        aonm.registerDefaultInstance(tgf.class, tgfVar);
    }

    private tgf() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005ဌ\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"b", "c", "d", "e", aduo.t, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new tgf();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (tgf.class) {
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
