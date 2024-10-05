package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoty extends aonm implements aooz {
    private static final aonv a = new uct(5);
    private static final aoty b;
    private static volatile aopf c;
    private aonu d = emptyIntList();

    static {
        aoty aotyVar = new aoty();
        b = aotyVar;
        aonm.registerDefaultInstance(aoty.class, aotyVar);
    }

    private aoty() {
    }

    public static aotx a() {
        return (aotx) b.createBuilder();
    }

    public static /* synthetic */ void c(aoty aotyVar, Iterable iterable) {
        aotyVar.d(iterable);
    }

    public void d(Iterable iterable) {
        e();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.d.g(((aotw) it.next()).h);
        }
    }

    private void e() {
        aonu aonuVar = this.d;
        if (aonuVar.c()) {
            return;
        }
        this.d = aonm.mutableCopy(aonuVar);
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
                return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"d", aotw.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aoty();
            case NEW_BUILDER:
                return new aotx();
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aoty.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
