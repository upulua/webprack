package ru.msu.cmc.webprack.DAO;

import lombok.Builder;
import lombok.Getter;
import ru.msu.cmc.webprack.models.Worker;

import java.util.List;

public interface WorkerDAO extends CommonDAO<Worker, Long> {
    List<Worker> getAllWorkers();
    List<Worker> getAllWorkerByName(String workerName);
    List<Worker> getByFilter(Filter filter);

    Worker getWorkerByName(String name);

    @Builder
    @Getter
    class Filter {
        private String name;
        private Long startDate;
    }

    static Filter.FilterBuilder getFilterBuilder() {
        return Filter.builder();
    }

}